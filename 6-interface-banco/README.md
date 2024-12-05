Um banco deseja refazer todo o seu sistema de software, visto que o antigo apresentava instabilidades. É seu papel implementar as seguintes funcionalidades requeridas:

a) No banco, toda conta possui um titular, um número da conta, um número que identifica a agência e o saldo. Porém não existem pessoas com uma conta sem tipo específico, e existem dois tipos de conta: conta corrente e conta poupança.

b) Uma conta Corrente possui, além dos dados básicos de uma conta, uma taxa de manutenção mensal da conta e um valor limite especial que o banco oferece para ser usado além do saldo da conta, caso seja necessário.

c) Uma conta corrente possui um método de realizar a manutenção mensal que não recebe parâmetros e debita o valor da taxa mensal de seu saldo (mesmo que isso signifique o saldo resultante ficar negativo). Considere implementar um método extra (que não é o método saque) para realizar esta operação.

d) Uma conta poupança possui um valor (um float que representa uma porcentagem) para seu rendimento mensal e um método que realiza o rendimento, ou seja, deposita na conta essa porcentagem do valor da conta.

e) Toda conta possui saldo e depósito, mas enquanto depósito é realizado por contas correntes e poupanças da mesma forma, o mesmo não acontece com saques. Saque da conta poupança considera apenas o saldo da conta, enquanto que saques na conta corrente considera o saldo mais o limite concedido pelo banco. Mas é imperativo que qualquer classe que seja Conta também implemente sua própria versão do método de saque.

f) Além disso, o banco deseja também manter um órgão de auditoria que rastreia os saques maiores que 500. Para isso, um método de consulta a saques maiores de 500 deve estar presente num banco para que ele seja auditável. O método retorna uma String com as informações de todos os saques de valores maiores de 500. A string deve conter o nome, número de conta, agência e valor de cada saque realizado. Experimente guardar as informações de cada saque maior que 500 numa coleção de String com as informações pedidas.

g) Um banco possui uma coleção de contas e métodos para adicionar e remover uma conta de sua coleção. Além disso, possui também um método que realiza o saque e recebe uma conta e um valor como parâmetros e um método de depósito que recebe também uma conta e um valor.