import request from '@/utils/request';


export async function queryBaseInfo(organizationCode) {
    return request(`http://localhost:8080/${organizationCode}/baseInfo`);
}

export async function queryAllGroup(organizationCode) {
    return request(`http://localhost:8080/${organizationCode}/groupList`);
}


export async function queryTopMemberWithUnused(organizationCode) {
    return request(`http://localhost:8080/${organizationCode}/topk/unused`);
}

export async function queryTopMemberWithTotal(organizationCode) {
    return request(`http://localhost:8080/${organizationCode}/topk/total`);
}


export async function queryAllMember(organizationCode) {
    return request(`http://localhost:8080/${organizationCode}/member/all`);
}

export async function addScoreDetail(detailData) {

    return request("http://localhost:8080/scoredetail/add",
        {
            method:'POST',
            body:{
                detailListStr:JSON.stringify(detailData),
                method: 'post',
            }
        });

}
