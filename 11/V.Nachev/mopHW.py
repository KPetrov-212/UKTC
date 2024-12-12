from itertools import product
import random

A = {7, 8, 9, 10, 'J', 'Q', 'K', 'A'}
B = {"\u2663", "\u2665", "\u2666", "\u2660"}
CARDS = list(product(A, B))

random.shuffle(CARDS)

PLAYER1 = CARDS[0:8]
PLAYER2 = CARDS[8:16]
PLAYER3 = CARDS[16:24]
PLAYER4 = CARDS[24:32]
PLAYERS = [PLAYER1, PLAYER2, PLAYER3, PLAYER4]

def check_announcements(hand):
    suits = {"\u2663": [], "\u2665": [], "\u2666": [], "\u2660": []}
    values = {'7': 1, '8': 2, '9': 3, '10': 4, 'J': 5, 'Q': 6, 'K': 7, 'A': 8}
    reverse_values = {v: k for k, v in values.items()}

    for card, suit in hand:
        suits[suit].append(card)

    announcements = []

    for suit, cards in suits.items():
        if 'Q' in cards and 'K' in cards:
            announcements.append(("Белот", 20, suit))

    for suit, cards in suits.items():
        numeric_cards = sorted([values[str(card)] for card in cards if str(card) in values])
        streak = []
        for card in numeric_cards:
            if not streak or card == streak[-1] + 1:
                streak.append(card)
            else:
                streak = [card]

            if len(streak) == 3:
                announcements.append(("Терца", 20, suit, [reverse_values[c] for c in streak]))
            elif len(streak) == 4:
                announcements = [a for a in announcements if a[0] != "Терца" or a[2] != suit]
                announcements.append(("Кварта", 50, suit, [reverse_values[c] for c in streak]))
            elif len(streak) == 5:
                announcements = [a for a     in announcements if a[0] in ["Терца", "Кварта"] and a[2] == suit]
                announcements.append(("Квинта", 100, suit, [reverse_values[c] for c in streak]))

    counts = {card: 0 for card in values.keys()}
    for card, _ in hand:
        if str(card) in counts:
            counts[str(card)] += 1

    for card, count in counts.items():
        if count == 4 and card not in {'7', '8'}:
            announcements.append(("Каре", 100 if card in {'J', 'Q', 'K', 'A'} else 50, card))

    return announcements

for i, player in enumerate(PLAYERS, start=1):
    announcements = check_announcements(player)
    print(f"Player {i}: {player}")
    if announcements:
        print(f"  Обявява: {announcements}")
    else:
        print("  Без обявяване")