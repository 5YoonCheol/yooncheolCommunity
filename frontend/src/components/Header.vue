<template>
  <header>
    <h1>Car뮤니티</h1>
    <nav>
      <router-link to="/">Home</router-link>
      <router-link to="/user">User</router-link>
    </nav>
  </header>
</template>

<script>
export default {
  name: "AppHeader"
};
</script>

<style scoped>
header {
  background: #333;
  color: #fff;
  padding: 1rem;
  text-align: center;
}
nav {
  margin-top: 0.5rem;
}
nav a {
  color: #fff;
  margin: 0 1rem;
  text-decoration: none;
}
</style>
