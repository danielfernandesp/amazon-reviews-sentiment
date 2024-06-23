# Project Overview
EN:
This project utilizes AWS Lambda for automated extraction and transformation of Amazon product review data, followed by sentiment analysis using tokenization and matching against an RDD sentiment dictionary. Results are stored in Hive for visualization using tools like QlikView, enabling interactive analysis of sentiment metrics by product ID and department. The process is streamlined with Hive tables that facilitate efficient data management and querying. 

PT:
Esse projeto utiliza AWS Lambda para extração automatizada e transformação de dados de revisões de produtos da Amazon, seguido por análise de sentimento através de tokenização e correspondência com um dicionário de sentimentos em RDD. Os resultados são armazenados em Hive para visualização através de ferramentas como QlikView, permitindo análise interativa das métricas de sentimento por ID de produto e departamento. O processo é otimizado com tabelas Hive que facilitam a gestão de dados e consultas eficientes.

# The Results:
EN:
The dashboard reveals a growing trend in negative reviews from 2011 to 2015, especially in the "Mobile_Electronics" and "Software" categories, which dominate the volume of reviews. Positive reviews are more prevalent in "Toys" and "Pet Products". The analysis focuses on 1-star ratings, highlighting areas of dissatisfaction, particularly in electronics, while showing better sentiment in toys and sports categories.

PT:
O painel mostra uma tendência crescente de avaliações negativas de 2011 a 2015, especialmente nas categorias "Mobile_Electronics" e "Software", que dominam o volume de avaliações. As avaliações positivas são mais prevalentes em "Brinquedos" e "Produtos para Animais de Estimação". A análise foca nas avaliações de 1 estrela, destacando áreas de insatisfação, principalmente em eletrônicos, enquanto mostra um sentimento melhor nas categorias de brinquedos e esportes.
