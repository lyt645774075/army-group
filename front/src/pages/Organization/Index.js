import React, {Component} from 'react';
import {connect} from 'dva';
import {formatMessage, FormattedMessage} from 'umi/locale';
import {
    Alert,
    Avatar,
    Badge,
    Col,
    Collapse,
    Divider,
    Form,
    Icon,
    Input,
    List,
    Modal,
    Row,
    Select,
    Tag,
    Upload
} from 'antd';
import styles from "./index.less";
import request from '@/utils/request';

import MemberListEdit from "../../components/MemberListEdit/Index";

const Panel = Collapse.Panel;
const FormItem = Form.Item;

const customPanelStyle = {
    background: '#009688',
    borderRadius: 2,
    marginBottom: 12,
    border: 0,
    overflow: 'hidden',
};

@Form.create()
class Organization extends Component {
    state = {

        organizationCode: undefined,

        submitModalVisible:false,
        fileList: [],

    };

    componentWillMount() {

        this.setState({
            organizationCode: this.props.computedMatch.params.code,
        })

        //查询军团信息
        this.props.dispatch({
            type: 'organization/queryBaseInfo',
            organizationCode: this.props.computedMatch.params.code,
        })

        //查询分团信息
        this.props.dispatch({
            type: 'organization/queryAllGroup',
            organizationCode: this.props.computedMatch.params.code,
        })

        //查询成员信息
        this.props.dispatch({
            type: 'organization/queryAllMember',
            organizationCode: this.props.computedMatch.params.code,
        })

        this.props.dispatch({
            type: 'organization/queryTopMemberWithTotal',
            organizationCode: this.props.computedMatch.params.code,
        })


        this.props.dispatch({
            type: 'organization/queryTopMemberWithUnused',
            organizationCode: this.props.computedMatch.params.code,
        })
    }


    doSubmit(){


        this.props.form.validateFields((error)=>{
            if(!error){
                let submitData = this.props.form.getFieldsValue();
                submitData.imageList = this.state.fileList.map(f=>f.url);

                this.props.dispatch({
                    type: 'organization/addScoreDetail',
                    organizationCode:this.state.organizationCode,
                    detailData: submitData,
                })

                this.setState({
                    submitModalVisible:false,
                })
            }
        });


    }


    render() {

        const {getFieldDecorator, setFieldsValue, getFieldsValue} = this.props.form;

        let {orgaBaseInfo,groupList,memberList, topkUnusedList, topkTotalList} = this.props.organization;

        return (
            <div style={{background: '#d8d8d8', paddingBottom: '20px'}}>
                <div>
                    <img style={{width: '100%', height: '180px'}}
                         src={"http://freturn.oss-cn-hangzhou.aliyuncs.com/img/bg.jpg"}/>
                </div>

                <div style={{margin: '6px'}}>

                    <Row gutter='8'>
                        <Col span={4}>
                            <div className={styles.content}>
                                <div style={{borderBottom: 'solid 3px #009688'}}>
                                    <img style={{height: '120px', width: '100%'}}
                                         src={"http://freturn.oss-cn-hangzhou.aliyuncs.com/img/2122547332.jpg"}/>
                                </div>

                                <div style={{marginTop: '20px'}}>
                                    <h2><span style={{borderLeft: 'solid 8px #009688', marginRight: '10px'}}></span>{orgaBaseInfo.name}
                                    </h2>
                                    <p style={{
                                        color: '#aaaaaa',
                                        fontFamily: 'Roboto, Helvetica Neue, Helvetica, Arial, sans-serif',
                                        fontWeight: '400',
                                        fontSize: '12px'
                                    }}>
                                        {orgaBaseInfo.description}
                                    </p>
                                </div>
                                <Divider/>

                                <div style={{fontSize: '12px'}}>
                                    <div style={{marginBottom: '8px', borderLeft: "solid 4px grey"}}>
                                        <b style={{color: '#a09b9b', marginLeft: '8px'}}>指挥部</b>
                                    </div>
                                    <div><b>总团长</b> <span style={{marginLeft: '8px'}}>{orgaBaseInfo.leader}</span></div>
                                    <div><b>其他</b> <span style={{marginLeft: '8px'}}>--</span></div>
                                </div>

                                <Divider/>
                                <div style={{fontSize: '12px'}}>
                                    <div style={{marginBottom: '8px', borderLeft: "solid 4px grey"}}>
                                        <b style={{color: '#a09b9b', marginLeft: '8px'}}>主力团（直属）</b>
                                    </div>

                                    {
                                        groupList.map(g=><div>
                                            <b>{g.name}</b> <span style={{marginLeft: '8px', float: 'right'}}>{g.leader}</span>
                                        </div>)
                                    }
                                </div>

                            </div>
                        </Col>

                        <Col span="20">
                            <Row style={{marginBottom: '8px', borderLeft: 'solid 3px #009688'}}>
                                <Alert
                                    message="公告"
                                    description="军团积分管理上线（内测中）..."
                                    type="success"
                                    style={{border: '0', borderRadius: '0'}}
                                />
                            </Row>
                            <Row gutter="8">
                                <Col span={18}>
                                    <div className={styles.content}>

                                        <Row gutter={48} style={{padding: '0 20px'}}>
                                            <Col span={12}>
                                                <div>
                                                    <Row style={{marginBottom: '10px'}}>
                                                        <Tag color="#009688"
                                                             style={{borderRadius: '0'}}><b>有效积分榜</b></Tag>
                                                        <a style={{color: '#009688'}} onClick={e=>{this.setState({submitModalVisible:true})}}>
                                                            上传
                                                        </a>
                                                    </Row>

                                                    <div>
                                                        <List
                                                            size="small"
                                                            itemLayout="horizontal"
                                                            dataSource={topkUnusedList}
                                                            renderItem={(user, index)=>{
                                                                return <List.Item>
                                                                    <List.Item.Meta
                                                                        avatar={<Badge count={index + 1} style={{ backgroundColor: index > 2 && '#52c41a' }} />}
                                                                        title={<a href="https://ant.design">
                                                                            {user.nickName ? user.gameName+`[${user.nickName}]` : user.gameName} </a>}
                                                                    />
                                                                    <span style={{color:'grey', marginRight:'15px'}}>积分</span>
                                                                    <a style={{marginRight: '20px', color:'#009688'}}><b>{user.unusedScore}</b></a>
                                                                </List.Item>
                                                            }
                                                            }
                                                        />
                                                    </div>
                                                </div>
                                            </Col>
                                            <Col span={12}>
                                                <div>
                                                    <Row style={{marginBottom: '10px'}}>
                                                        <Tag color="#009688"
                                                             style={{borderRadius: '0'}}><b>总积分榜</b></Tag>
                                                    </Row>

                                                    <div>
                                                        <List
                                                            size="small"
                                                            itemLayout="horizontal"
                                                            dataSource={topkTotalList}
                                                            renderItem={(user, index)=>{
                                                                return <List.Item>
                                                                    <List.Item.Meta
                                                                        avatar={<Badge count={index + 1} style={{ backgroundColor: index > 2 && '#52c41a' }} />}
                                                                        title={<a href="https://ant.design">
                                                                            {user.nickName ? user.gameName+`[${user.nickName}]` : user.gameName} </a>}
                                                                    />
                                                                    <span style={{color:'grey', marginRight:'15px'}}>积分</span>
                                                                    <a style={{marginRight: '20px', color:'#009688'}}><b>{user.totalScore}</b></a>
                                                                </List.Item>
                                                            }
                                                            }
                                                        />
                                                    </div>
                                                </div>
                                            </Col>
                                        </Row>

                                    </div>
                                </Col>
                                <Col span={6}>
                                    <div className={styles.content}>
                                        <Collapse
                                            bordered={false}
                                            expandIcon={({isActive}) => <Icon type="caret-right"
                                                                              rotate={isActive ? 90 : 0}/>}
                                        >
                                            {
                                                groupList.map(g=><Panel header={<span style={{color: 'white'}}><b>{g.name}</b></span>} key={g.code}
                                                                        style={customPanelStyle} showArrow={false}>
                                                    <span style={{color: 'white'}}>待研发</span>
                                                </Panel>)
                                            }

                                        </Collapse>

                                    </div>
                                </Col>
                            </Row>
                        </Col>

                    </Row>

                </div>


                <Modal
                    title="提交积分明细"
                    visible={this.state.submitModalVisible}
                    okText={"提交"}
                    onOk={this.doSubmit.bind(this)}
                    onCancel={e=>{this.setState({submitModalVisible:false})}}
                >
                    <Form
                    >


                        <Row>
                            <Col span={"10"}>
                                <FormItem>
                                    {getFieldDecorator('battleFieldId',{
                                        rules: [{ required: true, message: '必填' }],
                                    })(
                                        <Input placeholder={"战场编号"}/>)}
                                </FormItem>
                            </Col>
                            <Col span={"10"} offset={"4"}>
                                <FormItem>
                                    {getFieldDecorator('rank',{
                                        rules: [{ required: true, message: '必填' }],
                                    })(
                                        <Select placeholder={"军团排名"}>
                                            <Select.Option key={"first"}>军团第一</Select.Option>
                                            <Select.Option key={"second"}>军团第二</Select.Option>
                                        </Select>
                                    )}
                                </FormItem>
                            </Col>
                        </Row>

                        <FormItem>
                            {getFieldDecorator('memberList')(
                                <MemberListEdit memberList={memberList}/>
                            )}
                        </FormItem>

                        <Upload
                            listType="picture-card"
                            fileList={this.state.fileList}
                            onRemove={e => console.log(e)}
                            customRequest={e => {

                                let formData = new FormData();
                                formData.append("file", e.file);

                                request('http://localhost:8080/upload.json', {
                                    method: 'POST',
                                    body: formData,
                                }).then(r => {
                                    let fileList = this.state.fileList;

                                    fileList.push({
                                        uid: fileList.length,
                                        name: e.file.name,
                                        status: 'done',
                                        url: r.url,
                                    })

                                    this.setState({
                                        fileList: fileList,
                                    })

                                });
                            }}
                        >

                            <a><Icon type="upload"/> 战场截图</a>

                        </Upload>

                        <Divider/>

                        <FormItem>
                            {getFieldDecorator('permissionCode',{
                                rules: [{ required: true, message: '权限识别码必需，请联系@公羊申请' }],
                            })(
                                <Input placeholder={"权限识别码"}/>
                            )}
                        </FormItem>

                        {getFieldDecorator('imageList')(
                            <Input type="hidden"/>
                        )}

                    </Form>
                </Modal>
            </div>
        );
    }
}

export default connect(({organization}) => ({
    organization
}))(Organization);
