class Cookie:
    def __init__(self, color) -> None:
        self.color = color
    
    def get_color(self):
        return self.color
    
    def set_color(self, color):
        self.color = color

c1 = Cookie('green')
c2 = Cookie('blue')

print('Cookie one is ', c1.get_color())
print('Cookie two is ', c2.get_color())

c1.set_color('yellow')
print('Cookie one is ', c1.get_color())
print('Cookie two is ', c2.get_color())