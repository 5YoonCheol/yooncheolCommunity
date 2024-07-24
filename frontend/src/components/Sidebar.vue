<template>
  <aside>
    <ul>
      <li><router-link to="/">Home</router-link></li>
      <li><router-link to="/forum">Forum</router-link></li>
      <li><router-link to="/user-profile">Profile</router-link></li>
    </ul>
  </aside>
</template>

<script>
export default {
  name: "AppSidebar"
};
</script>

<style scoped>
aside {
  background: #f4f4f4;
  width: 200px;
  height: 100vh;
  position: fixed;
  top: 0;
  left: 0;
  padding: 1rem;
}
ul {
  list-style: none;
  padding: 0;
}
li {
  margin: 1rem 0;
}
</style>
