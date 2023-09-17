<script setup lang="ts">
import type { Card } from '@/utils/types'

defineProps<{
  card: Card
}>()
</script>

<template>
  <div>
    <p>{{ card.type }} {{ card.value }}</p>
  </div>
</template>
