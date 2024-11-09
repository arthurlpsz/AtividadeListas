# Sistema de Cadastro de Alunos

## Objetivo

Este projeto visa atualizar o sistema de cadastro de alunos para incluir funcionalidades de atualização e exclusão de registros na interface gráfica `JFrame2`. O usuário poderá visualizar, atualizar e excluir informações dos alunos.

## Funcionalidades Implementadas

### 1. **Funcionalidade de Atualização de Aluno**
- No `JFrame2`, ao selecionar um aluno na lista (usando o `JComboBox`), os dados de nome e telefone do aluno são exibidos nos campos correspondentes.
- O usuário pode editar os dados de `nome e telefone` nos campos de texto com o botão `atualizar`.
- Uma mensagem de confirmação é exibida para informar que o aluno foi atualizado com sucesso usando `JOptionPane`.

### 2. **Funcionalidade de Exclusão de Aluno**
- Foi adicionado um botão **"Excluir"** no `JFrame2` que permite remover o aluno selecionado da lista de registros.
- Antes de excluir, o sistema solicita uma confirmação através de uma janela `JOptionPane` para garantir que o usuário deseja realmente excluir o aluno.
- Caso o usuário confirme a exclusão, o aluno é removido da lista e o `JComboBox` é atualizado automaticamente para refletir a mudança.

### Desenvolvido por: 
`Larissa Cristina` e `Arthur Lopes`


