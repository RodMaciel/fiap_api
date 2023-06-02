CREATE TABLE produtos (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          nome VARCHAR(255) NOT NULL,
                          marca VARCHAR(255) NOT NULL,
                          tipo VARCHAR(255) NOT NULL,
                          peso VARCHAR(10) NOT NULL,
                          preco DECIMAL(10, 2) NOT NULL,
                          descricao TEXT,
                          ingredientes TEXT
);