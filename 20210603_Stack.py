class stack:
    def __init__(self):
        self.st = []

    def push(self, data):
        self.st.append(data)

    def pop(self):
        if(self.isEmpty() == False):
            del self.st[-1]
            return print(s.st)
        else:
            print("nothing to delete")

    def isEmpty(self):
        if(len(self.st) == 0):
            return True
        return False


s = stack()
s.push(1)
s.push(2)
s.push(3)
s.push(4)
s.pop()
s.pop()
s.pop()
s.pop()
