# Merge Sort

Meta: Ordenar un Array ya sea de menor a mayor o alreves.

La idea basica es dividie un problema grande en problemas pequeños. Divde and conquer, dividiremos primero y uniremos después (split first, merge after).

0.- Tenemos un array a ordenar `[7, 2, 6, 3, 9]`

1.- **Split in half**, dividiremos el array a la mitad: `[7, 2]` ,`[6, 3, 9]`

2.- Seguimos dividiendo hasta no poder hacerlo mas. Hasta tener un elemento en cada pila: `[7]`,`[2]`,`[6]`, `[3]`, `[9]`

3.- Entonces ya es momento de Unir (merge):

ej. `[2,7]` y `[6]` y esto da... `[2, 6, 7]`

## Código completo






