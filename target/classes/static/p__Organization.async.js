(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([[0],{"5Ugv":function(e,t,a){"use strict";a.r(t);a("JpAa");var n,r,l,o=a("MgCt"),i=(a("ogue"),a("pTpi")),c=(a("CqAe"),a("25Jm")),m=(a("B/yZ"),a("CZsP")),s=(a("xXtT"),a("L+jO")),p=(a("6DKo"),a("a43F")),d=(a("+oPY"),a("7Pas")),u=(a("7Z3p"),a("6j4w")),E=(a("xYi0"),a("/x81")),g=(a("mTxv"),a("4xe2")),h=(a("VFYf"),a("KtH6")),y=(a("DUmq"),a("PGjP")),f=a("Pjwa"),b=a.n(f),v=a("2cji"),x=a.n(v),k=a("sp3j"),z=a.n(k),C=a("vZkh"),L=a.n(C),M=a("+KCP"),S=a.n(M),w=(a("/Clt"),a("hJLW")),N=(a("g0W6"),a("tXWf")),T=a("ee5G"),B=a.n(T),R=a("LneV"),j=(a("5o7j"),a("uH4S")),O=a.n(j),q=a("t3Un"),I=a("smUt"),F=a.n(I),V=void 0,P=function(e){var t=e.value,a=0,n=t?t.map(function(e){return F()({index:a++},e)}):[],r=function(){n.push({index:n.length,memberCode:void 0,eventType:"normal",eventMemo:void 0}),i(n)},l=function(e){var t=n.filter(function(t){return t.index!=e});i(t)},o=function(e,t,a){var r=a&&a.target?a.target.value:a,l=n[e];l[t]=r,i(n)},i=function(t){var a=e.onChange;a&&a(t)};return B.a.createElement("div",{style:{border:"dashed 1px #e8e8e8",borderRadius:"2px",padding:"0 10px"}},B.a.createElement(E["a"],{style:{color:"#d8d8d8",borderBottom:"solid 2px #d8d8d8"},gutter:"8"},B.a.createElement(h["a"],{span:"6"},"\u6e38\u620f\u540d"),B.a.createElement(h["a"],{span:"6"},"\u52a0\u5206\u7c7b\u578b"),B.a.createElement(h["a"],{span:"10"},"\u5907\u6ce8"),B.a.createElement(h["a"],{span:"1"},B.a.createElement("a",{onClick:r.bind(V)},B.a.createElement(s["a"],{type:"plus-circle",theme:"outlined"})))),B.a.createElement("div",{style:{height:"160px"}},n&&n.map(function(t){return B.a.createElement(E["a"],{gutter:"8",key:t.index,style:{borderBottom:"dashed 1px #f2f2f2"}},B.a.createElement(h["a"],{span:"6"},B.a.createElement(c["a"],{size:"small",value:t.memberCode,onChange:o.bind(V,t.index,"memberCode")},e.memberList.map(function(e){return B.a.createElement(c["a"].Option,{key:e.code},e.nickName?e.gameName+"["+e.nickName+"]":e.gameName)}))),B.a.createElement(h["a"],{span:"6"},B.a.createElement(c["a"],{size:"small",value:t.eventType,onChange:o.bind(V,t.index,"eventType")},B.a.createElement(c["a"].Option,{key:"normal"},"\u5e38\u89c4\u8d21\u732e"),B.a.createElement(c["a"].Option,{key:"6s-assist"},"6S\u573a-\u62a4\u822a"),B.a.createElement(c["a"].Option,{key:"achievement-assist"},"\u6210\u5c31\u573a-\u62a4\u822a"),B.a.createElement(c["a"].Option,{key:"special"},"\u7279\u6b8a\u8d21\u732e"))),B.a.createElement(h["a"],{span:"10"},B.a.createElement(m["a"],{size:"small",value:t.eventMemo,onChange:o.bind(V,t.index,"eventMemo")})),B.a.createElement(h["a"],{span:"1"},B.a.createElement("a",{onClick:l.bind(V,t.index)},B.a.createElement(s["a"],{type:"minus-circle",theme:"outlined"}))))})))},A=P,W=N["a"].Panel,D=w["a"].Item,U={background:"#009688",borderRadius:2,marginBottom:12,border:0,overflow:"hidden"},H=(n=w["a"].create(),n((l=function(e){function t(){var e,a;b()(this,t);for(var n=arguments.length,r=new Array(n),l=0;l<n;l++)r[l]=arguments[l];return a=z()(this,(e=L()(t)).call.apply(e,[this].concat(r))),a.state={organizationCode:void 0,submitModalVisible:!1,fileList:[]},a}return S()(t,e),x()(t,[{key:"componentWillMount",value:function(){this.setState({organizationCode:this.props.computedMatch.params.code}),this.props.dispatch({type:"organization/queryBaseInfo",organizationCode:this.props.computedMatch.params.code}),this.props.dispatch({type:"organization/queryAllGroup",organizationCode:this.props.computedMatch.params.code}),this.props.dispatch({type:"organization/queryAllMember",organizationCode:this.props.computedMatch.params.code}),this.props.dispatch({type:"organization/queryTopMemberWithTotal",organizationCode:this.props.computedMatch.params.code}),this.props.dispatch({type:"organization/queryTopMemberWithUnused",organizationCode:this.props.computedMatch.params.code})}},{key:"doSubmit",value:function(){var e=this;this.props.form.validateFields(function(t){if(!t){var a=e.props.form.getFieldsValue();a.imageList=e.state.fileList.map(function(e){return e.url}),e.props.dispatch({type:"organization/addScoreDetail",organizationCode:e.state.organizationCode,detailData:a}),e.setState({submitModalVisible:!1})}})}},{key:"render",value:function(){var e=this,t=this.props.form,a=t.getFieldDecorator,n=(t.setFieldsValue,t.getFieldsValue,this.props.organization),r=n.orgaBaseInfo,l=n.groupList,f=n.memberList,b=n.topkUnusedList,v=n.topkTotalList;return B.a.createElement("div",{style:{background:"#d8d8d8",paddingBottom:"20px"}},B.a.createElement("div",null,B.a.createElement("img",{style:{width:"100%",height:"180px"},src:"http://freturn.oss-cn-hangzhou.aliyuncs.com/img/bg.jpg"})),B.a.createElement("div",{style:{margin:"6px"}},B.a.createElement(E["a"],{gutter:"8"},B.a.createElement(h["a"],{span:4},B.a.createElement("div",{className:O.a.content},B.a.createElement("div",{style:{borderBottom:"solid 3px #009688"}},B.a.createElement("img",{style:{height:"120px",width:"100%"},src:"http://freturn.oss-cn-hangzhou.aliyuncs.com/img/2122547332.jpg"})),B.a.createElement("div",{style:{marginTop:"20px"}},B.a.createElement("h2",null,B.a.createElement("span",{style:{borderLeft:"solid 8px #009688",marginRight:"10px"}}),r.name),B.a.createElement("p",{style:{color:"#aaaaaa",fontFamily:"Roboto, Helvetica Neue, Helvetica, Arial, sans-serif",fontWeight:"400",fontSize:"12px"}},r.description)),B.a.createElement(y["a"],null),B.a.createElement("div",{style:{fontSize:"12px"}},B.a.createElement("div",{style:{marginBottom:"8px",borderLeft:"solid 4px grey"}},B.a.createElement("b",{style:{color:"#a09b9b",marginLeft:"8px"}},"\u6307\u6325\u90e8")),B.a.createElement("div",null,B.a.createElement("b",null,"\u603b\u56e2\u957f")," ",B.a.createElement("span",{style:{marginLeft:"8px"}},r.leader)),B.a.createElement("div",null,B.a.createElement("b",null,"\u5176\u4ed6")," ",B.a.createElement("span",{style:{marginLeft:"8px"}},"--"))),B.a.createElement(y["a"],null),B.a.createElement("div",{style:{fontSize:"12px"}},B.a.createElement("div",{style:{marginBottom:"8px",borderLeft:"solid 4px grey"}},B.a.createElement("b",{style:{color:"#a09b9b",marginLeft:"8px"}},"\u4e3b\u529b\u56e2\uff08\u76f4\u5c5e\uff09")),l.map(function(e){return B.a.createElement("div",null,B.a.createElement("b",null,e.name)," ",B.a.createElement("span",{style:{marginLeft:"8px",float:"right"}},e.leader))})))),B.a.createElement(h["a"],{span:"20"},B.a.createElement(E["a"],{style:{marginBottom:"8px",borderLeft:"solid 3px #009688"}},B.a.createElement(g["a"],{message:"\u516c\u544a",description:"\u519b\u56e2\u79ef\u5206\u7ba1\u7406\u4e0a\u7ebf\uff08\u5185\u6d4b\u4e2d\uff09...",type:"success",style:{border:"0",borderRadius:"0"}})),B.a.createElement(E["a"],{gutter:"8"},B.a.createElement(h["a"],{span:18},B.a.createElement("div",{className:O.a.content},B.a.createElement(E["a"],{gutter:48,style:{padding:"0 20px"}},B.a.createElement(h["a"],{span:12},B.a.createElement("div",null,B.a.createElement(E["a"],{style:{marginBottom:"10px"}},B.a.createElement(u["a"],{color:"#009688",style:{borderRadius:"0"}},B.a.createElement("b",null,"\u6709\u6548\u79ef\u5206\u699c")),B.a.createElement("a",{style:{color:"#009688"},onClick:function(t){e.setState({submitModalVisible:!0})}},"\u4e0a\u4f20")),B.a.createElement("div",null,B.a.createElement(p["a"],{size:"small",itemLayout:"horizontal",dataSource:b,renderItem:function(e,t){return B.a.createElement(p["a"].Item,null,B.a.createElement(p["a"].Item.Meta,{avatar:B.a.createElement(d["a"],{count:t+1,style:{backgroundColor:t>2&&"#52c41a"}}),title:B.a.createElement("a",{href:"https://ant.design"},e.nickName?e.gameName+"[".concat(e.nickName,"]"):e.gameName," ")}),B.a.createElement("span",{style:{color:"grey",marginRight:"15px"}},"\u79ef\u5206"),B.a.createElement("a",{style:{marginRight:"20px",color:"#009688"}},B.a.createElement("b",null,e.unusedScore)))}})))),B.a.createElement(h["a"],{span:12},B.a.createElement("div",null,B.a.createElement(E["a"],{style:{marginBottom:"10px"}},B.a.createElement(u["a"],{color:"#009688",style:{borderRadius:"0"}},B.a.createElement("b",null,"\u603b\u79ef\u5206\u699c"))),B.a.createElement("div",null,B.a.createElement(p["a"],{size:"small",itemLayout:"horizontal",dataSource:v,renderItem:function(e,t){return B.a.createElement(p["a"].Item,null,B.a.createElement(p["a"].Item.Meta,{avatar:B.a.createElement(d["a"],{count:t+1,style:{backgroundColor:t>2&&"#52c41a"}}),title:B.a.createElement("a",{href:"https://ant.design"},e.nickName?e.gameName+"[".concat(e.nickName,"]"):e.gameName," ")}),B.a.createElement("span",{style:{color:"grey",marginRight:"15px"}},"\u79ef\u5206"),B.a.createElement("a",{style:{marginRight:"20px",color:"#009688"}},B.a.createElement("b",null,e.totalScore)))}}))))))),B.a.createElement(h["a"],{span:6},B.a.createElement("div",{className:O.a.content},B.a.createElement(N["a"],{bordered:!1,expandIcon:function(e){var t=e.isActive;return B.a.createElement(s["a"],{type:"caret-right",rotate:t?90:0})}},l.map(function(e){return B.a.createElement(W,{header:B.a.createElement("span",{style:{color:"white"}},B.a.createElement("b",null,e.name)),key:e.code,style:U,showArrow:!1},B.a.createElement("span",{style:{color:"white"}},"\u5f85\u7814\u53d1"))})))))))),B.a.createElement(o["a"],{title:"\u63d0\u4ea4\u79ef\u5206\u660e\u7ec6",visible:this.state.submitModalVisible,okText:"\u63d0\u4ea4",onOk:this.doSubmit.bind(this),onCancel:function(t){e.setState({submitModalVisible:!1})}},B.a.createElement(w["a"],null,B.a.createElement(E["a"],null,B.a.createElement(h["a"],{span:"10"},B.a.createElement(D,null,a("battleFieldId",{rules:[{required:!0,message:"\u5fc5\u586b"}]})(B.a.createElement(m["a"],{placeholder:"\u6218\u573a\u7f16\u53f7"})))),B.a.createElement(h["a"],{span:"10",offset:"4"},B.a.createElement(D,null,a("rank",{rules:[{required:!0,message:"\u5fc5\u586b"}]})(B.a.createElement(c["a"],{placeholder:"\u519b\u56e2\u6392\u540d"},B.a.createElement(c["a"].Option,{key:"first"},"\u519b\u56e2\u7b2c\u4e00"),B.a.createElement(c["a"].Option,{key:"second"},"\u519b\u56e2\u7b2c\u4e8c")))))),B.a.createElement(D,null,a("memberList")(B.a.createElement(A,{memberList:f}))),B.a.createElement(i["a"],{listType:"picture-card",fileList:this.state.fileList,onRemove:function(e){return console.log(e)},customRequest:function(t){var a=new FormData;a.append("file",t.file),Object(q["a"])("http://localhost:8080/upload.json",{method:"POST",body:a}).then(function(a){var n=e.state.fileList;n.push({uid:n.length,name:t.file.name,status:"done",url:a.url}),e.setState({fileList:n})})}},B.a.createElement("a",null,B.a.createElement(s["a"],{type:"upload"})," \u6218\u573a\u622a\u56fe")),B.a.createElement(y["a"],null),B.a.createElement(D,null,a("permissionCode",{rules:[{required:!0,message:"\u6743\u9650\u8bc6\u522b\u7801\u5fc5\u9700\uff0c\u8bf7\u8054\u7cfb@\u516c\u7f8a\u7533\u8bf7"}]})(B.a.createElement(m["a"],{placeholder:"\u6743\u9650\u8bc6\u522b\u7801"}))),a("imageList")(B.a.createElement(m["a"],{type:"hidden"})))))}}]),t}(T["Component"]),r=l))||r);t["default"]=Object(R["connect"])(function(e){var t=e.organization;return{organization:t}})(H)},uH4S:function(e,t,a){e.exports={content:"antd-pro-pages-organization-index-content"}}}]);