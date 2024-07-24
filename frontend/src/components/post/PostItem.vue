<template>
  <div>
    <h2>{{ post.title }}</h2>
    <p>{{ post.content }}</p>
  </div>
</template>

<script>
export default {
  name: "PostItem",
  data() {
    return {
      post: {
        title: "Sample Post",
        content: "This is the content of the post."
      }
    };
  },
  created() {
    const postId = this.$route.params.id;
    // 여기서 postId를 이용해 실제 포스트 데이터를 불러올 수 있습니다.
  }
};
</script>

<style scoped>
div {
  padding: 1rem;
}
</style>
