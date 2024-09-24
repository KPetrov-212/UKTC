class Battleship:
    def __init__(self, name, alliandce, shield_capacity, blaster_damage, speed, light_speed_module):
        self.name = name
        self.alliandce = alliandce
        self.shield_capacity = shield_capacity
        self.blaster_damage = blaster_damage
        self.speed = speed
        self.light_speed_module = light_speed_module

    def travel(self):
        pass
    def fight(self):
        pass

class XWing(Battleship):
    def __init__(self, maneuverability):
        self.maneuverability = maneuverability
        

    def evade(self):
