package cards

import cards.enums.Suit

class Card(val suit: Suit, val rank: Int) : Comparable<Card> {
    private val rankBeforeJack = 10
    private val dignities = arrayOf("Ace", "Jack", "Queen", "King", "Joker")

    private fun isStandardDeck(): Boolean {
        return rank in 0..14
    }

    private fun isStronger(card: Card): Boolean {
        return if (suit === card.suit) rank > card.rank else false
    }

    override fun compareTo(other: Card): Int {
        if (this == other) return 0
        return if (this.isStronger(other) || suit.ordinal > other.suit.ordinal) 1 else -1
    }

    fun compare(first: Card, second: Card): Int {
        return first.compareTo(second)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is Card) return false
        return rank == other.rank && suit == other.suit
    }

    override fun hashCode(): Int {
        return rank * suit.hashCode()
    }

    override fun toString(): String {
        if(!isStandardDeck())
            return "This card not from a non-standard deck"
        val rankAsStr: String = if (rank == 1)
            dignities[0]
        else if (rank > rankBeforeJack)
            dignities[rank - rankBeforeJack]
        else
            rank.toString()
        return "Card{Suit: $suit, Rank: $rankAsStr}"
    }
}