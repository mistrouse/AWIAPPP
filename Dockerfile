FROM 1science/sbt

COPY . /src

WORKDIR /src

RUN sbt clean compile

ENTRYPOINT ["sbt", "run"]