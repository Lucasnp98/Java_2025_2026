## Ejercicios de programación gráfica en Java

### 1. Dibujo sobre panel personalizado
Modificar las prácticas anteriores para que las figuras se dibujen sobre un panel que herede de `JPanel`, sobrescribiendo el método `paintComponent`.

---

### 2. Interacción con el ratón y entrada de datos
Implementar una funcionalidad que permita, al hacer clic sobre el panel, dibujar un círculo cuyo diámetro se introduzca mediante un `JTextField`.

- Las coordenadas **X** e **Y** del círculo deberán coincidir con el punto donde se haya realizado el clic.

---

### 3. Animación en una ventana independiente
En una ventana independiente (otro `JFrame`), que disponga de su propio panel y su correspondiente método `paintComponent`:

- Añadir al menos una figura (la que se desee).
- Incorporar un botón de **“Animación”** que, al pulsarlo, provoque algún tipo de animación sobre la figura.

Ejemplos de animación:
- Parpadeo  
- Cambio de color  
- Desplazamiento hasta desaparecer  
- Rebote contra los bordes  

⚠️ **Importante:**  
Es obligatorio implementar la animación utilizando un **hilo**.
