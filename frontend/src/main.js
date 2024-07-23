import { createApp } from 'vue'
import App from './App.vue'
import router from "@/router";
import apiClient from "@/js/axios";

const app = createApp(App);

// Axios를 전역에서 사용하도록 설정
app.config.globalProperties.$axios = apiClient;

app.use(router);
app.mount('#app');
