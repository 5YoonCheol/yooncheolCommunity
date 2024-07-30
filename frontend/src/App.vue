<template>
  <div id="app">
    <AppHeader v-if="!isLoginPage"/>
    <div id="main">
      <AppSidebar v-if="!isLoginPage"/>
      <div id="content">
        <router-view />
      </div>
    </div>
    <AppFooter v-if="!isLoginPage"/>
  </div>
</template>

<script>

import AppHeader from "@/components/Header.vue";
import AppSidebar from "@/components/Sidebar.vue";
import AppFooter from "@/components/Footer.vue";

export default {
  name: 'App',
  components: {AppFooter, AppSidebar, AppHeader},
  computed: {
    isLoginPage() {
      return this.$route.path === '/login';
    }
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
#main {
  display: flex;
}
#content {
  margin-left: 200px; /* Sidebar 공간 */
  padding: 1rem;
  width: calc(100% - 200px);
}
</style>
