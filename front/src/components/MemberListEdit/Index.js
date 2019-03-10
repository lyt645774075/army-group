import React from 'react';
import { Spin , Row, Col, Icon, Select, Input, Divider} from 'antd';

/**
 * 值格式：[{
        gameName:string;
        eventType:undefined;
        eventMemo:und
       }]
 */

const MemberListEdit =  (props) => {

    let {value} = props;
    //给值加上顺序号
    let i = 0;
    const valueArray = value ? value.map(item=>{return {index:i++ , ...item}}) : [];

    const addRowData=()=>{
        valueArray.push({
            index:valueArray.length,
            memberCode:undefined,
            eventType:'normal',
            eventMemo:undefined,
        });

        triggerOnChange(valueArray);
    }

    const deleteRowData=(index)=>{

        let newValueArray = valueArray.filter(i=>i.index != index);

        triggerOnChange(newValueArray);
    }


    const valueChange=(index, propName, propValue)=>{

        let realValue = (propValue && propValue.target) ? propValue.target.value : propValue;

        let obj = valueArray[index];

        obj[propName] = realValue;

        triggerOnChange(valueArray);
    }

    const triggerOnChange=(value)=>{
        const onChange = props.onChange;
        if (onChange) {
            onChange(value);
        }
    }

    return <div style={{border:'dashed 1px #e8e8e8', borderRadius:'2px', padding:'0 10px', }}>
      <Row style={{color:'#d8d8d8',borderBottom:'solid 2px #d8d8d8'}} gutter="8">
        <Col span="6">
          游戏名
        </Col>
        <Col span="6">
          加分类型
        </Col>
        <Col span="10" >
          备注
        </Col>
        <Col span="1">
          <a onClick={addRowData.bind(this)}><Icon type="plus-circle" theme="outlined" /></a>
        </Col>
      </Row>

      <div style={{height:'160px'}}>
          {
              valueArray && valueArray.map(i=><Row gutter="8" key={i.index} style={{borderBottom:'dashed 1px #f2f2f2'}}>
                <Col span="6" >
                  <Select size="small" value={i.memberCode} onChange={valueChange.bind(this,i.index,'memberCode')}>
                      {
                          props.memberList.map(m=><Select.Option key={m.code}>
                              {m.nickName ? m.gameName + "[" + m.nickName + "]" : m.gameName}
                          </Select.Option>)
                      }
                  </Select>
                </Col>

                <Col span="6">
                  <Select size="small" value={i.eventType} onChange={valueChange.bind(this,i.index,'eventType')}>
                      <Select.Option key={"normal"}>常规贡献</Select.Option>
                      <Select.Option key={"6s-assist"}>6S场-护航</Select.Option>
                      <Select.Option key={"achievement-assist"}>成就场-护航</Select.Option>
                      <Select.Option key={"special"}>特殊贡献</Select.Option>
                  </Select>
                </Col>
                <Col span="10">
                  <Input size={"small"} value={i.eventMemo} onChange={valueChange.bind(this,i.index,'eventMemo')} />
                </Col>
                <Col span="1">
                  <a onClick={deleteRowData.bind(this, i.index)}><Icon type="minus-circle" theme="outlined" /></a>
                </Col>
              </Row>)
          }
      </div>
    </div>
};


export default MemberListEdit;