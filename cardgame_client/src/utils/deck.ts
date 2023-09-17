
const API_URL = import.meta.env.VITE_APP_API_URI;

export async function getShuffledHand() {
    const hand = await (await fetch(`${API_URL}/hand`)).json();
    return hand;
}
