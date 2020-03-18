Feature: Acessar Guia Medico 

Background:
	Given que o usuario esta na pagina inicial da Unimed 
	When ele clicar no menu Guia Medico 
	Then eh redirecionado para pesquisa detalhada 
	And informa o estado Rio de Janeiro e a cidade do Rio de janeiro e seleciona unidade 
	And clica em pesquisar 
	And informa prestador Medico e clica em pesquisar 

Scenario: Pesquisar medico Rio de Janeiro	
	Then valida a pesquisa por especialidade e cidade 
	
Scenario: Pesquisar medico de Sao Paulo	
	And pesquisa por medico de Sao Paulo
	But nao eh encontrado nenhum resultado