<script setup lang="ts">

defineProps<{
    loadingText: string
}>()

</script>
<template>
    <div class="spinner-container">
        <div>
            <img alt="Persona Logo"
                src="https://gcdn.thunderstore.io/live/repository/icons/Lacirev-Persona5Soundtrack-1.4.1.png.128x128_q95.png"
                class="image">
        </div>
        {{ loadingText }}

    </div>
</template>

<style scoped>
.spinner-container {
    display: flex;
    flex-direction: column;
    align-items: center;
}

p {
    margin-top: 5px;
    letter-spacing: 1px;
}

.image {
    animation: spinner 1s infinite linear;
}

@keyframes spinner {
    0% {
        transform: rotate3d(0, 1, 0, 0deg);
    }

    50% {
        transform: rotate3d(0, 1, 0, 180deg);
    }

    100% {
        transform: rotate3d(0, 1, 0, 360deg);
    }
}
</style>