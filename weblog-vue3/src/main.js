import '@/assets/main.css'
import 'animate.css'

import { createApp } from 'vue'
import App from '@/App.vue'

import router from '@/router'

// 导入 Element Plus 图标
import * as ElementPlusIconsVue from '@element-plus/icons-vue'

const app = createApp(App)

app.use(router)
app.mount('#app')

// 引入图标
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
}
