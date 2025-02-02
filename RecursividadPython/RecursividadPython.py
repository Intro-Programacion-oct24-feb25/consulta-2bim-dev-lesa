def factorial(n):
    if n == 0 or n == 1:
        return 1
    return n * factorial(n - 1)

def main():
    numero = 5
    print(f"El factorial de {numero} es: {factorial(numero)}")
    
    for i in range(8):
        print(f"Factorial de {i}: {factorial(i)}")

if __name__ == "__main__":
    main()