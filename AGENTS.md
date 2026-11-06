# Instrucciones para agentes

- Lee este archivo antes de trabajar. Este debe colocarse en la raíz del proyecto.
- Lee **únicamente** las partes de la documentación pedidas por el usuario, a menos de que sea explícitamente pedida la lectura de toda la carpeta.

## Restricciones de ejecución

- NO compiles, generes builds, ejecutes tareas de construcción ni inicies Minecraft, servidores o clientes de desarrollo, salvo petición explícita del usuario para hacerlo.
- Esta prohibición incluye invocaciones indirectas: tareas de IDE, scripts, CI, comandos de Gradle y pruebas que desencadenen compilación o arranquen el juego. No ejecutes una herramienta de comprobación sin conocer sus efectos.
- Solo se hará lo anterior con la solicitud explícita del usuario.

## Desarrollo y publicación

- El mod estará dividido en varias áreas temáticas, para facilitar el desarrollo, solo se revisará las áreas pedidas por el usuario.
- No preguntarás nada en los procesos, en cambio, tomarás una decisión ante cualquier duda, y la comentarás al culminar el proceso.
- Por defecto, no tomarás en cuenta los mundos que tengan cambios anteriores a los que vayas a hacer, a menos de que el usuario te solicite lo contrario.
- Por defecto no editarás el código, harás cambios, ni commits. El usuario, sin embargo, podrá pedírtelo mediante palabras como: "Implementa", "Haz", etc.
- En caso haya sido solicitado, los commits siempre serán en la rama "26.2", nunca serán locales.
- El agente podrá ver ejemplos de instrucciones en `docs/instrucciones` y su resultado esperado. Solo lo verá si no entiende la instrucción. 
- la solicitud para implementar cualquier objeto de todas las áreas debe incluir "{nombre_del_area} y {numero_de_orden}".
- El número de orden servirá únicamente como ayuda para que el agente pueda ubicar mejor el objeto, mas no tendrá uso alguno en el juego.
- Únicamente si en la instrucción se solicita crear un modelo y textura, mira `docs/modelos_y_texturas`.
- Únicamente si se solicita crear una entidad, mira `docs/entidades`.
- Los cambios únicamente se anotarán en `CHANGELOG.md`