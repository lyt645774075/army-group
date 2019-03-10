export default [


    // user
    {
        path: '/',
        routes: [
            { path: '/', redirect: '/organization' },
            { path: '/organization/:code', name:'军团',component: './Organization' },
        ],
    }
];
