#include <stdio.h>

int main() {
    char nombre[50];
    int anio_nacimiento, edad;
    int anio_actual = 2025;

    printf("¿Cuál es tu nombre? ");
    scanf("%s", nombre);

    printf("¿En qué año naciste? ");
    scanf("%d", &anio_nacimiento);

    edad = anio_actual - anio_nacimiento;

    printf("Hola %s, tienes %d años. Este programa está hecho en el lenguaje de programación: C.\n", nombre, edad);

    return 0;
}
