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

# The Components:

EN:
The "Ext-Streamer": This AWS Lambda function regularly crawls an S3 bucket for new files, copying them into an interim S3 bucket. This triggers another Lambda function that processes these files, generating chunks of JSON objects with reviews, which are stored in another S3 bucket for consumption by a Spark Streaming Job for sentiment analysis.
The "Analyzer": Reviews are tokenized into unigrams and matched against a sentiment dictionary RDD. Each matched word's sentiment value is summed to classify the review as positive, negative, or neutral. The sentiment results are merged with the original review data and stored in HDFS for analysis.
The "Visualizer": Sentiment analysis results are connected to QlikView, displaying time series charts and filtering options by product ID or department. This data is updated daily, joining product demographic information with the sentiment data for comprehensive visualization.
The "Feeder-api": Multiple Hive tables are created to store the data. The staging table holds daily outputs with unique keys, which are then loaded into the Master table in ORC format. This facilitates efficient querying and analysis using Hive QL and Spark SQL, tracking sentiment metrics by product ID or department.

PT:
O "Ext-Streamer": Esta função AWS Lambda rastreia regularmente um bucket S3 em busca de novos arquivos, copiando-os para um bucket S3 intermediário. Isso aciona outra função Lambda que processa esses arquivos, gerando pedaços de objetos JSON com avaliações, que são armazenados em outro bucket S3 para consumo por um trabalho Spark Streaming para análise de sentimento.
O "Analyzer": As avaliações são tokenizadas em unigrama e comparadas com um dicionário de sentimento RDD. Cada palavra correspondente tem seu valor de sentimento somado para classificar a avaliação como positiva, negativa ou neutra. Os resultados de sentimento são mesclados com os dados de avaliação originais e armazenados no HDFS para análise.
O "Visualizer": Os resultados da análise de sentimento são conectados ao QlikView, exibindo gráficos de séries temporais e opções de filtragem por ID de produto ou departamento. Esses dados são atualizados diariamente, unindo informações demográficas do produto com os dados de sentimento para uma visualização abrangente.
O "Feeder-api": Várias tabelas Hive são criadas para armazenar os dados. A tabela de estágio contém saídas diárias com chaves únicas, que são então carregadas na tabela Master no formato ORC. Isso facilita a consulta e análise eficiente usando Hive QL e Spark SQL, rastreando métricas de sentimento por ID de produto ou departamento.
