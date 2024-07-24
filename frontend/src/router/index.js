import { createRouter, createWebHistory } from 'vue-router';
import HomePage from '../pages/HomePage.vue';
import UserProfile from "@/components/user/UserProfile.vue";
import PostView from "../pages/post/PostView.vue";

const routes = [
    { path: '/', name:'Home', component: HomePage },
    { path: '/forum', name:'Forum', component: PostView},
    { path: '/user-profile', name:'User', component: UserProfile}
];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;
