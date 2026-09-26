FROM jenkins/jenkins:lts

USER root

# Install Docker CLI and other required tools
RUN apt-get update && \
    apt-get install -y \
        ca-certificates \
        curl \
        git \
        && \
    rm -rf /var/lib/apt/lists/*

USER jenkins

EXPOSE 8080
EXPOSE 50000
