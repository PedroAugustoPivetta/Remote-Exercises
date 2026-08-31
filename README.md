# Biblioteca de Exercícios de Programação

Repositório dedicado ao estudo, prática e consulta de algoritmos, estruturas de dados e resolução de exercícios de programação.

---

## Estrutura do Repositório

Cada exercício/projeto fica isolado em sua respectiva subpasta dentro da raiz:

.
├── README.md
├── exercicio-01-fibonacci/
│   └── main.py (ou .js, .java, etc.)
├── exercicio-02-palindromo/
│   └── index.js
└── exercicio-03-busca-binaria/
    └── main.go

### 1 ATUALIZAÇÃO DA MAIN

git checkout main --> Muda para a branch main (principal)  
git pull origin main --> Puxa o repositório remoto atualizado

### 2 - CRIAÇÃO DA NOVA BRANCH

git checkout -b exercicio-nome-do-exercicio --> Cria uma nova branch para o novo exercicio

### CASO NÃO TENHA FINALIZADO O CÓDIGO

git add .
git commit -m "o que foi feito / o que falta fazer"
git push origin nome-da-branch-do-exercicio --> Envia o que foi feito para a branch remota

### CASO O CÓDIGO TENHA SIDO FINALIZADO

git add .
git commit -m "o que foi feito / o que falta fazer"
git checkout main --> Muda para a branch principal (Main)
git merge exercicio-nome-do-exercicio --> Une o nova código com o que já existe na main
git push origin main --> Envia tudo para a main
git branch -d exercicio-nome-do-exercicio --> Deleta a branch com o exercicio que foi mergeado

### OUTROS - MUITO ÚTIL

git status --> Mostra o estado atual do repositório
git branch --> Lista todas as branchs locais
git log --> Mostra o histórico de commits

### PADRÕES DE NOMENCLATURA

Prefixo, Finalidade, Exemplo de Uso
feat:,Adição de uma nova funcionalidade ou novo exercício,feat: adiciona algoritmo de busca binaria

fix:,"Correção de um bug, erro de lógica ou falha no código",fix: corrige condicao de parada na recursao

refactor:,Mudança no código que melhora a estrutura sem alterar o resultado,refactor: otimiza funcao para reduzir complexidade O(n)

docs:,Alterações exclusivas na documentação ou arquivos README,docs: atualiza guia de fluxo no README

style:,"Formatação, indentação ou ajustes visuais (sem alterar lógica)",style: ajusta identacao do script python

test:,Adição ou ajuste de testes unitários/automatizados,test: adiciona casos de teste para numeros negativos

perf:,Mudança focada exclusivamente em melhorar a performance,perf: troca array por hash set para busca mais rapida

chore:,"Tarefas de manutenção geral, configs de ambiente ou ferramentas",chore: atualiza versao do node no package.json