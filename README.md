# Aplicación Web

Aplicación web, con vista HTML con funciones de registro, actualización, eliminación y visualización de una entidad Alumno (ciclo CRUD completo). Además, existe una vista web de login, como vista principal de toda la app y en la que se pide loguearse para pasar a la vista de alumnos. Desde el login, se puede crear un usuario nuevo y para esto se crea una entidad usuario.

Por último, se ha creado una tercera entidad, que es el registrador. Este modelo recoge el nombre de usuario y su contraseña para buscar en la base de datos si existe ese usuario con esa contraseña. Ambos deben coincidir para poder acceder al listado de alumnos. En caso contrario, se muestra un mensaje genérico de alerta indicando que ha habido un error.

Para entrar a la aplicación hay que poner en el navegador: 

http://localhost:8087/home
