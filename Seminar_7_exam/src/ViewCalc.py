
class ViewCalc:

    # Выводим результат: число в виде строки
    def print_result(self,number):
        print(f'Результат: {number.get_number()}')

    # Произвольное сообщение
    def prompt_msg(self,msg):
        print(msg)

    # Сообщение о вводе. Возвращает введённую строку
    def prompt_input(self,msg):
        print(msg, end='')
        prompt = input()
        return prompt
