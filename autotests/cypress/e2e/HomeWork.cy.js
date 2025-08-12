   describe('Домашка по автотестам', function () {

    it('1.Позитив-авторизация', function () {
           cy.visit('https://login.qa.studio/');
                 cy.get('#forgotEmailButton').should('have.css', 'color', 'rgb(0, 85, 152)');
                 cy.get('#mail').type('german@dolnikov.ru');
                 cy.get('#pass').type('qa_one_love1');
                 cy.get('#loginButton').click();
                 cy.get('#messageHeader').should('be.visible');
                 cy.get('#messageHeader').contains('Авторизация прошла успешно');
                 cy.get('#exitMessageButton > .exitIcon').should('be.visible');
     })
 it('2.Восстановление пароля', function () {
        cy.visit('https://login.qa.studio');
        cy.get('#forgotEmailButton').should('have.css', 'color', 'rgb(0, 85, 152)');
        cy.get('#forgotEmailButton').click();
        cy.get('#mailForgot').type('12@mail.ru');
        cy.get('#restoreEmailButton').click();
        cy.get('#messageHeader').contains('Успешно отправили пароль на e-mail');
        cy.get('#exitMessageButton > .exitIcon').should('be.visible');
    })
it('3.Негатив, неверный пароль', function () {
        cy.visit('https://login.qa.studio');
        cy.get('#forgotEmailButton').should('have.css', 'color', 'rgb(0, 85, 152)');
        cy.get('#mail').type('german@dolnikov.ru');
        cy.get('#pass').type('1234qwE');
        cy.get('#loginButton').click();
        cy.get('#messageHeader').should('be.visible');
        cy.get('#messageHeader').contains('Такого логина или пароля нет');
        cy.get('#exitMessageButton > .exitIcon').should('be.visible');
    })
    it('4.Негатив, неверный логин', function () {
            cy.visit('https://login.qa.studio');
            cy.get('#forgotEmailButton').should('have.css', 'color', 'rgb(0, 85, 152)');
            cy.get('#mail').type('filin@dolnikov.ru');
            cy.get('#pass').type('qa_one_love1');
            cy.get('#loginButton').click();
            cy.get('#messageHeader').should('be.visible');
            cy.get('#messageHeader').contains('Такого логина или пароля нет');
            cy.get('#exitMessageButton > .exitIcon').should('be.visible');
        })
        it('5.Негатив, валидация на наличие @', function () {
                cy.visit('https://login.qa.studio');
                cy.get('#forgotEmailButton').should('have.css', 'color', 'rgb(0, 85, 152)');
                cy.get('#mail').type('germandolnikov.ru');
                cy.get('#pass').type('qa_one_love1');
                cy.get('#loginButton').click();
                cy.get('#messageHeader').should('be.visible');
                cy.get('#messageHeader').contains('Нужно исправить проблему валидации');
                cy.get('#exitMessageButton > .exitIcon').should('be.visible');
            })
            it('6.Проверка- строчные буквы', function () {
                       cy.visit('https://login.qa.studio/');
                             cy.get('#forgotEmailButton').should('have.css', 'color', 'rgb(0, 85, 152)');
                             cy.get('#mail').type('GerMan@Dolnikov.ru');
                             cy.get('#pass').type('qa_one_love1');
                             cy.get('#loginButton').click();
                             cy.get('#messageHeader').should('be.visible');
                             cy.get('#messageHeader').contains('Авторизация прошла успешно');
                             cy.get('#exitMessageButton > .exitIcon').should('be.visible');
                 })
                  })

