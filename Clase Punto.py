class Punto:
    def __init__(self, x: float, y: float):
        self.x = x
        self.y = y

    def coord_cartesianas(self):
        return (self.x, self.y)

    def coord_polares(self):
        r = (self.x**2 + self.y**2) ** 0.5
        theta = math.atan2(self.y, self.x)
        return (r, theta)

    def __str__(self):
        return f"Punto({self.x}, {self.y})"
