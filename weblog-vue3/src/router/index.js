import Index from '@/pages/frontend/index.vue'
import { createRouter, createWebHashHistory } from 'vue-router'
import Login from '@/pages/admin/login.vue'
import AdminIndex from '@/pages/admin/index.vue'

const routes = [
    {
        path: '/',
        component: Index,
        meta: {
            title: 'weblog 首页' //页面标题
        }
    },
    {
        path: '/login',
        component: Login,
        meta: {
            title: 'weblog登录页'
        }
    },
    {
        path: "/admin/index", // 后台首页
        component: AdminIndex,
        meta: {
            title: 'Admin 后台首页'
        }
    },
]

const router = createRouter({
    history: createWebHashHistory(),
    routes
})

//将router对象导出，以便其他文件使用
export default router