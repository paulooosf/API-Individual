<h1 align="center">API - Individual</h1>
<h4 align="center">O projeto foi desenvolvido visando uma Biblioteca, em que a API seria capaz de efetuar operações CRUD (Create, Read, Update e Delete)
 e efetuar validações de dados em um banco de dados, dessa vez sendo o banco H2.</h4>
<p align="center">
<img alt="Java" src="https://img.shields.io/badge/JAVA-%23F80820?style=for-the-badge&logoColor=%23F80820&labelColor=black">
<img alt="Spring" src="https://img.shields.io/badge/SPRING-%236DB33F?style=for-the-badge&logo=spring&logoColor=%236DB33F&labelColor=black">
</p>
<p align="center">
  <a href="#endpoints">Endpoints</a> •
  <a href="#créditos">Créditos</a>
</p>

## Endpoints
<ul>
<h3 style="font-family:verdana;">Listar livros (GET):</h3>
<li style="font-family:verdana;">localhost:8080/livros/lista</li>
<h3 style="font-family:verdana;">Buscar livros (GET):</h3>
<li style="font-family:verdana;">localhost:8080/livros/buscar/{id}</li>
<h3 style="font-family:verdana;">Inserir livro (POST):</h3>
<li style="font-family:verdana;">localhost:8080/livros/inserir</dd>
<h3 style="font-family:verdana;">Alterar livro (PUT):</h3>
<li style="font-family:verdana;">localhost:8080/livros/alterar/{id}</li>
<h3 style="font-family:verdana;">Deletar livro (DELETE):</h3>
<li style="font-family:verdana;">localhost:8080/livros/deletar/{id}</li>
</ul>
<i style="font-family:verdana;">OBS: As requisições POST e PUT precisam passar um Json válido em seu corpo.</i>
<p></p>
<i style="font-family:verdana;">OBS²: Susbtituir {id} por uma ID específica de algum livro.</i>

## Créditos
- Paulo Henrique - [paulooosf](http://github.com/paulooosf)
