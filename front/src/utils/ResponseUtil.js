import { message,Modal } from 'antd';
import React from 'react';

export function parseJsonResult(result){



    //检查是否成功
    if (!result.jsonResult.success || result.jsonResult.success == 'false') {
        message.error("业务异常:" + result.jsonResult.msg, 5);

        return false;
    } else {
        return result.jsonResult.data ? result.jsonResult.data : true;
    }

}
