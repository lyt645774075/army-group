import * as orgApi from '@/services/organization';

export default {
  namespace: 'organization',

  state: {

      orgaBaseInfo:{},
      groupList:[],

      topkUnusedList:[],
      topkTotalList:[],

      memberList:[],
  },

  effects: {

      *queryBaseInfo({organizationCode}, {call, put}){
          let result = yield call(orgApi.queryBaseInfo, organizationCode);

          if(result.success){
              yield put({
                  type:'updateState',
                  orgaBaseInfo:result.data,
              })
          }
      },

      *queryAllGroup({organizationCode}, {call, put}){
          let result = yield call(orgApi.queryAllGroup, organizationCode);

          if(result.success){
              yield put({
                  type:'updateState',
                  groupList:result.data,
              })
          }
      },

      *queryTopMemberWithUnused({organizationCode}, {call, put}){
          let result = yield call(orgApi.queryTopMemberWithUnused, organizationCode);

          if(result.success){
              yield put({
                  type:'updateState',
                  topkUnusedList:result.data,
              })
          }
      },

      *queryTopMemberWithTotal({organizationCode}, {call, put}){
          let result = yield call(orgApi.queryTopMemberWithTotal, organizationCode);

          if(result.success){
              yield put({
                  type:'updateState',
                  topkTotalList:result.data,
              })
          }
      },

      *queryAllMember({organizationCode}, {call, put}){
          let result = yield call(orgApi.queryAllMember, organizationCode);

          if(result.success){
              yield put({
                  type:'updateState',
                  memberList:result.data,
              })

          }
      },

      *addScoreDetail({organizationCode, detailData}, {call, put}){
          let result = yield call(orgApi.addScoreDetail, detailData);

          if(result.success){
              yield put({
                  type:'queryTopMemberWithTotal',
                  organizationCode:organizationCode,
              })

              yield put({
                  type:'queryTopMemberWithUnused',
                  organizationCode:organizationCode,
              })
          }
      }
  },

  reducers: {

      // effects触发reducers改变state状态
      updateState(state, payload) {
          return {
              ...state,
              ...payload
          };
      },

  },


};
