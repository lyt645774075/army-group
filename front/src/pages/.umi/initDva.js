import dva from 'dva';
import createLoading from 'dva-loading';

const runtimeDva = window.g_plugins.mergeConfig('dva');
let app = dva({
  history: window.g_history,
  
  ...(runtimeDva.config || {}),
});

window.g_app = app;
app.use(createLoading());
(runtimeDva.plugins || []).forEach(plugin => {
  app.use(plugin);
});

app.model({ namespace: 'global', ...(require('/Users/yangtao.lyt/workspace/git/army-group/front/src/models/global.js').default) });
app.model({ namespace: 'organization', ...(require('/Users/yangtao.lyt/workspace/git/army-group/front/src/models/organization.js').default) });
