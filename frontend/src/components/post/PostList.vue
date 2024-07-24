<template>
  <div>
    <h2>Forum Posts</h2>
    <ul>
      <li v-for="post in posts" :key="post.id">
        <router-link :to="{ name: 'Post', params: { id: post.id } }">{{ post.title }}</router-link>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: "PostList",
  data() {
    return {
      posts: [
        { id: 1, title: "First Post" },
        { id: 2, title: "Second Post" },
      ],
    };
  },
};
</script>

<style scoped>
ul {
  list-style: none;
  padding: 0;
}
li {
  margin: 0.5rem 0;
}
</style>
