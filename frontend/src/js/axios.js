import axios from 'axios';

// 기본 URL 설정
const apiClient = axios.create({
    baseURL: process.env.VUE_APP_API_URL || 'http://localhost:8088/api', // 환경 변수 또는 기본 URL
    headers: {
        'Content-Type': 'application/json',
    },
});

export default apiClient;
