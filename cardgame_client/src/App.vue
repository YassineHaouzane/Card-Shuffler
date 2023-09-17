<script setup lang="ts">
import { ref, watchEffect, type Ref } from 'vue'
import LoadingSpinner from './components/LoadingSpinner.vue'
import { getShuffledHand } from './utils/deck'
import { type Card } from './utils/types'
import CardInfo from './components/CardInfo.vue'

type HandResponse = {
  sortedHand: Card[]
  shuffledHand: Card[]
}

let hands: Ref<HandResponse | undefined> = ref(undefined)

watchEffect(async () => {
  let response = await getShuffledHand()
  hands.value = response
  console.log(hands.value)
})
</script>

<template>
  <div v-if="hands">
    <p>Shuffled hand</p>
    <ul>
      <li v-for="card in hands.shuffledHand" :key="card.type + card.value">
        <CardInfo :card="card"></CardInfo>
      </li>
    </ul>

    <p>Sorted hand</p>
    <ul>
      <li v-for="card in hands.sortedHand" :key="card.type + card.value">
        <CardInfo :card="card" />
      </li>
    </ul>
  </div>
  <LoadingSpinner v-else loading-text="Loading your hand..." />
</template>
