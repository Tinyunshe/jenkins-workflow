

void stepsFunc_FTPTest() {
		script {
      def ftp_server = "FTPServer"
      def username = "username"
      def password = "password"
      def addresses = "addresses"
      def qa = "qa"
      def ops = "ops"
      def deploy = "deploy"
      def doc = "doc"
      def devops= "devops"
      def ait = "ait"
                              // 定义一个数组，存储一些数字
                    def numbers = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sum = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbers.size(); i++) {
                        if (numbers[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sum += numbers[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sum += numbers[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sum > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersa = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def suma = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersa.size(); i++) {
                        if (numbersa[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            suma += numbersa[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            suma += numbersa[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (suma > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个列表，存储一些字符串
                    def strings = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]

                    // 定义一个变量，用于存储字符串长度之和
                    def lengthSum = 0

                    // 使用 for 循环计算字符串长度之和
                    for (def i = 0; i < strings.size(); i++) {
                        lengthSum += strings[i].length()
                    }

                    // 判断字符串长度之和是否大于 50
                    if (lengthSum > 50) {
                        // 如果大于 50，输出字符串长度之和和字符串个数
                        println "字符串长度之和为 ${lengthSum}，共有 ${strings.size()} 个字符串。"
                    } else {
                        // 如果小于等于 50，输出字符串长度之和和字符串平均长度
                        println "字符串长度之和为 ${lengthSum}，平均长度为 ${lengthSum / strings.size()}。"
                    }

                    // 定义一个变量，用于存储字符串中元音以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：

                    // 定义一个数组，存储一些数字
                    def numbersb = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumb = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersb.size(); i++) {
                        if (numbersb[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumb += numbersb[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumb += numbersb[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumb > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersc = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumc = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersc.size(); i++) {
                        if (numbersc[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumc += numbersc[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumc += numbersc[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumc > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和为了避免重复，这里提供一份不同的 Groovy 示例程序，其中定义了至少 10 个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    def numbersd = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
                    def stringsa = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]
                    def vowels = ['a', 'e', 'i', 'o', 'u']
                    def consonants = ['b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z']
                    def sumd = 0
                    def product = 1
                    def max = 0
                    def min = 0
                    def vowelCount = 0
                    def consonantCount = 0

                    for (def i = 0; i < numbersd.size(); i++) {
                        if (numbersd[i] % 3 == 0) {
                            sumd += numbersd[i]
                        } else if (consonants[i] == "j") {
                            product *= numbersd[i]
                        } else {
                            max = Math.max(max, numbersd[i])
                            min = (i == 0) ? numbersd[i] : Math.min(min, numbersd[i])
                        }
                    }

                    for (def i = 0; i < stringsa.size(); i++) {
                        def currentString = stringsa[i]
                        if (currentString.startsWith('a') || currentString.startsWith('e') || currentString.startsWith('i') || currentString.startsWith('o') || currentString.startsWith('u')) {
                            vowelCount++
                        } else {
                            consonantCount++
                        }
                    }

                    for (int i = 1; i <= 2100; i++) {
                            echo "ALAUDAALAUDAALAUDAALAUDAALAUDA"
                        }
}

	}
void stepsFunc_qa2() {
		script {
      def ftp_server = "FTPServer"
      def username = "username"
      def password = "password"
      def addresses = "addresses"
      def qa = "qa"
      def ops = "ops"
      def deploy = "deploy"
      def doc = "doc"
      def devops= "devops"
      def ait = "ait"
                              // 定义一个数组，存储一些数字
                    def numbers = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sum = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbers.size(); i++) {
                        if (numbers[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sum += numbers[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sum += numbers[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sum > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersa = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def suma = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersa.size(); i++) {
                        if (numbersa[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            suma += numbersa[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            suma += numbersa[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (suma > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个列表，存储一些字符串
                    def strings = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]

                    // 定义一个变量，用于存储字符串长度之和
                    def lengthSum = 0

                    // 使用 for 循环计算字符串长度之和
                    for (def i = 0; i < strings.size(); i++) {
                        lengthSum += strings[i].length()
                    }

                    // 判断字符串长度之和是否大于 50
                    if (lengthSum > 50) {
                        // 如果大于 50，输出字符串长度之和和字符串个数
                        println "字符串长度之和为 ${lengthSum}，共有 ${strings.size()} 个字符串。"
                    } else {
                        // 如果小于等于 50，输出字符串长度之和和字符串平均长度
                        println "字符串长度之和为 ${lengthSum}，平均长度为 ${lengthSum / strings.size()}。"
                    }

                    // 定义一个变量，用于存储字符串中元音以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：

                    // 定义一个数组，存储一些数字
                    def numbersb = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumb = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersb.size(); i++) {
                        if (numbersb[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumb += numbersb[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumb += numbersb[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumb > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersc = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumc = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersc.size(); i++) {
                        if (numbersc[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumc += numbersc[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumc += numbersc[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumc > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和为了避免重复，这里提供一份不同的 Groovy 示例程序，其中定义了至少 10 个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    def numbersd = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
                    def stringsa = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]
                    def vowels = ['a', 'e', 'i', 'o', 'u']
                    def consonants = ['b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z']
                    def sumd = 0
                    def product = 1
                    def max = 0
                    def min = 0
                    def vowelCount = 0
                    def consonantCount = 0

                    for (def i = 0; i < numbersd.size(); i++) {
                        if (numbersd[i] % 3 == 0) {
                            sumd += numbersd[i]
                        } else if (consonants[i] == "j") {
                            product *= numbersd[i]
                        } else {
                            max = Math.max(max, numbersd[i])
                            min = (i == 0) ? numbersd[i] : Math.min(min, numbersd[i])
                        }
                    }

                    for (def i = 0; i < stringsa.size(); i++) {
                        def currentString = stringsa[i]
                        if (currentString.startsWith('a') || currentString.startsWith('e') || currentString.startsWith('i') || currentString.startsWith('o') || currentString.startsWith('u')) {
                            vowelCount++
                        } else {
                            consonantCount++
                        }
                    }

                    for (int i = 1; i <= 2100; i++) {
                            echo "ALAUDAALAUDAALAUDAALAUDAALAUDA"
                        }
}

	}
void stepsFunc_qa3() {
		script {
      def ftp_server = "FTPServer"
      def username = "username"
      def password = "password"
      def addresses = "addresses"
      def qa = "qa"
      def ops = "ops"
      def deploy = "deploy"
      def doc = "doc"
      def devops= "devops"
      def ait = "ait"
                              // 定义一个数组，存储一些数字
                    def numbers = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sum = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbers.size(); i++) {
                        if (numbers[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sum += numbers[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sum += numbers[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sum > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersa = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def suma = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersa.size(); i++) {
                        if (numbersa[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            suma += numbersa[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            suma += numbersa[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (suma > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个列表，存储一些字符串
                    def strings = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]

                    // 定义一个变量，用于存储字符串长度之和
                    def lengthSum = 0

                    // 使用 for 循环计算字符串长度之和
                    for (def i = 0; i < strings.size(); i++) {
                        lengthSum += strings[i].length()
                    }

                    // 判断字符串长度之和是否大于 50
                    if (lengthSum > 50) {
                        // 如果大于 50，输出字符串长度之和和字符串个数
                        println "字符串长度之和为 ${lengthSum}，共有 ${strings.size()} 个字符串。"
                    } else {
                        // 如果小于等于 50，输出字符串长度之和和字符串平均长度
                        println "字符串长度之和为 ${lengthSum}，平均长度为 ${lengthSum / strings.size()}。"
                    }

                    // 定义一个变量，用于存储字符串中元音以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：

                    // 定义一个数组，存储一些数字
                    def numbersb = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumb = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersb.size(); i++) {
                        if (numbersb[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumb += numbersb[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumb += numbersb[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumb > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersc = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumc = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersc.size(); i++) {
                        if (numbersc[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumc += numbersc[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumc += numbersc[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumc > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和为了避免重复，这里提供一份不同的 Groovy 示例程序，其中定义了至少 10 个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    def numbersd = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
                    def stringsa = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]
                    def vowels = ['a', 'e', 'i', 'o', 'u']
                    def consonants = ['b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z']
                    def sumd = 0
                    def product = 1
                    def max = 0
                    def min = 0
                    def vowelCount = 0
                    def consonantCount = 0

                    for (def i = 0; i < numbersd.size(); i++) {
                        if (numbersd[i] % 3 == 0) {
                            sumd += numbersd[i]
                        } else if (consonants[i] == "j") {
                            product *= numbersd[i]
                        } else {
                            max = Math.max(max, numbersd[i])
                            min = (i == 0) ? numbersd[i] : Math.min(min, numbersd[i])
                        }
                    }

                    for (def i = 0; i < stringsa.size(); i++) {
                        def currentString = stringsa[i]
                        if (currentString.startsWith('a') || currentString.startsWith('e') || currentString.startsWith('i') || currentString.startsWith('o') || currentString.startsWith('u')) {
                            vowelCount++
                        } else {
                            consonantCount++
                        }
                    }

                    for (int i = 1; i <= 2100; i++) {
                            echo "ALAUDAALAUDAALAUDAALAUDAALAUDA"
                        }
}

	}
void stepsFunc_qa4() {
		script {
      def ftp_server = "FTPServer"
      def username = "username"
      def password = "password"
      def addresses = "addresses"
      def qa = "qa"
      def ops = "ops"
      def deploy = "deploy"
      def doc = "doc"
      def devops= "devops"
      def ait = "ait"
                              // 定义一个数组，存储一些数字
                    def numbers = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sum = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbers.size(); i++) {
                        if (numbers[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sum += numbers[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sum += numbers[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sum > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersa = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def suma = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersa.size(); i++) {
                        if (numbersa[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            suma += numbersa[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            suma += numbersa[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (suma > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个列表，存储一些字符串
                    def strings = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]

                    // 定义一个变量，用于存储字符串长度之和
                    def lengthSum = 0

                    // 使用 for 循环计算字符串长度之和
                    for (def i = 0; i < strings.size(); i++) {
                        lengthSum += strings[i].length()
                    }

                    // 判断字符串长度之和是否大于 50
                    if (lengthSum > 50) {
                        // 如果大于 50，输出字符串长度之和和字符串个数
                        println "字符串长度之和为 ${lengthSum}，共有 ${strings.size()} 个字符串。"
                    } else {
                        // 如果小于等于 50，输出字符串长度之和和字符串平均长度
                        println "字符串长度之和为 ${lengthSum}，平均长度为 ${lengthSum / strings.size()}。"
                    }

                    // 定义一个变量，用于存储字符串中元音以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：

                    // 定义一个数组，存储一些数字
                    def numbersb = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumb = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersb.size(); i++) {
                        if (numbersb[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumb += numbersb[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumb += numbersb[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumb > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersc = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumc = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersc.size(); i++) {
                        if (numbersc[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumc += numbersc[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumc += numbersc[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumc > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和为了避免重复，这里提供一份不同的 Groovy 示例程序，其中定义了至少 10 个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    def numbersd = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
                    def stringsa = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]
                    def vowels = ['a', 'e', 'i', 'o', 'u']
                    def consonants = ['b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z']
                    def sumd = 0
                    def product = 1
                    def max = 0
                    def min = 0
                    def vowelCount = 0
                    def consonantCount = 0

                    for (def i = 0; i < numbersd.size(); i++) {
                        if (numbersd[i] % 3 == 0) {
                            sumd += numbersd[i]
                        } else if (consonants[i] == "j") {
                            product *= numbersd[i]
                        } else {
                            max = Math.max(max, numbersd[i])
                            min = (i == 0) ? numbersd[i] : Math.min(min, numbersd[i])
                        }
                    }

                    for (def i = 0; i < stringsa.size(); i++) {
                        def currentString = stringsa[i]
                        if (currentString.startsWith('a') || currentString.startsWith('e') || currentString.startsWith('i') || currentString.startsWith('o') || currentString.startsWith('u')) {
                            vowelCount++
                        } else {
                            consonantCount++
                        }
                    }

                    for (int i = 1; i <= 2100; i++) {
                            echo "ALAUDAALAUDAALAUDAALAUDAALAUDA"
                        }
}

	}
void stepsFunc_qa5() {
		script {
      def ftp_server = "FTPServer"
      def username = "username"
      def password = "password"
      def addresses = "addresses"
      def qa = "qa"
      def ops = "ops"
      def deploy = "deploy"
      def doc = "doc"
      def devops= "devops"
      def ait = "ait"
                              // 定义一个数组，存储一些数字
                    def numbers = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sum = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbers.size(); i++) {
                        if (numbers[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sum += numbers[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sum += numbers[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sum > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersa = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def suma = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersa.size(); i++) {
                        if (numbersa[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            suma += numbersa[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            suma += numbersa[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (suma > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个列表，存储一些字符串
                    def strings = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]

                    // 定义一个变量，用于存储字符串长度之和
                    def lengthSum = 0

                    // 使用 for 循环计算字符串长度之和
                    for (def i = 0; i < strings.size(); i++) {
                        lengthSum += strings[i].length()
                    }

                    // 判断字符串长度之和是否大于 50
                    if (lengthSum > 50) {
                        // 如果大于 50，输出字符串长度之和和字符串个数
                        println "字符串长度之和为 ${lengthSum}，共有 ${strings.size()} 个字符串。"
                    } else {
                        // 如果小于等于 50，输出字符串长度之和和字符串平均长度
                        println "字符串长度之和为 ${lengthSum}，平均长度为 ${lengthSum / strings.size()}。"
                    }

                    // 定义一个变量，用于存储字符串中元音以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：

                    // 定义一个数组，存储一些数字
                    def numbersb = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumb = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersb.size(); i++) {
                        if (numbersb[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumb += numbersb[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumb += numbersb[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumb > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersc = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumc = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersc.size(); i++) {
                        if (numbersc[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumc += numbersc[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumc += numbersc[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumc > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和为了避免重复，这里提供一份不同的 Groovy 示例程序，其中定义了至少 10 个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    def numbersd = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
                    def stringsa = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]
                    def vowels = ['a', 'e', 'i', 'o', 'u']
                    def consonants = ['b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z']
                    def sumd = 0
                    def product = 1
                    def max = 0
                    def min = 0
                    def vowelCount = 0
                    def consonantCount = 0

                    for (def i = 0; i < numbersd.size(); i++) {
                        if (numbersd[i] % 3 == 0) {
                            sumd += numbersd[i]
                        } else if (consonants[i] == "j") {
                            product *= numbersd[i]
                        } else {
                            max = Math.max(max, numbersd[i])
                            min = (i == 0) ? numbersd[i] : Math.min(min, numbersd[i])
                        }
                    }

                    for (def i = 0; i < stringsa.size(); i++) {
                        def currentString = stringsa[i]
                        if (currentString.startsWith('a') || currentString.startsWith('e') || currentString.startsWith('i') || currentString.startsWith('o') || currentString.startsWith('u')) {
                            vowelCount++
                        } else {
                            consonantCount++
                        }
                    }

                    for (int i = 1; i <= 2100; i++) {
                            echo "ALAUDAALAUDAALAUDAALAUDAALAUDA"
                        }
}

	}
void stepsFunc_qa6() {
		script {
      def ftp_server = "FTPServer"
      def username = "username"
      def password = "password"
      def addresses = "addresses"
      def qa = "qa"
      def ops = "ops"
      def deploy = "deploy"
      def doc = "doc"
      def devops= "devops"
      def ait = "ait"
                              // 定义一个数组，存储一些数字
                    def numbers = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sum = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbers.size(); i++) {
                        if (numbers[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sum += numbers[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sum += numbers[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sum > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersa = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def suma = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersa.size(); i++) {
                        if (numbersa[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            suma += numbersa[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            suma += numbersa[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (suma > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个列表，存储一些字符串
                    def strings = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]

                    // 定义一个变量，用于存储字符串长度之和
                    def lengthSum = 0

                    // 使用 for 循环计算字符串长度之和
                    for (def i = 0; i < strings.size(); i++) {
                        lengthSum += strings[i].length()
                    }

                    // 判断字符串长度之和是否大于 50
                    if (lengthSum > 50) {
                        // 如果大于 50，输出字符串长度之和和字符串个数
                        println "字符串长度之和为 ${lengthSum}，共有 ${strings.size()} 个字符串。"
                    } else {
                        // 如果小于等于 50，输出字符串长度之和和字符串平均长度
                        println "字符串长度之和为 ${lengthSum}，平均长度为 ${lengthSum / strings.size()}。"
                    }

                    // 定义一个变量，用于存储字符串中元音以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：

                    // 定义一个数组，存储一些数字
                    def numbersb = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumb = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersb.size(); i++) {
                        if (numbersb[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumb += numbersb[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumb += numbersb[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumb > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersc = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumc = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersc.size(); i++) {
                        if (numbersc[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumc += numbersc[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumc += numbersc[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumc > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和为了避免重复，这里提供一份不同的 Groovy 示例程序，其中定义了至少 10 个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    def numbersd = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
                    def stringsa = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]
                    def vowels = ['a', 'e', 'i', 'o', 'u']
                    def consonants = ['b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z']
                    def sumd = 0
                    def product = 1
                    def max = 0
                    def min = 0
                    def vowelCount = 0
                    def consonantCount = 0

                    for (def i = 0; i < numbersd.size(); i++) {
                        if (numbersd[i] % 3 == 0) {
                            sumd += numbersd[i]
                        } else if (consonants[i] == "j") {
                            product *= numbersd[i]
                        } else {
                            max = Math.max(max, numbersd[i])
                            min = (i == 0) ? numbersd[i] : Math.min(min, numbersd[i])
                        }
                    }

                    for (def i = 0; i < stringsa.size(); i++) {
                        def currentString = stringsa[i]
                        if (currentString.startsWith('a') || currentString.startsWith('e') || currentString.startsWith('i') || currentString.startsWith('o') || currentString.startsWith('u')) {
                            vowelCount++
                        } else {
                            consonantCount++
                        }
                    }

                    for (int i = 1; i <= 2100; i++) {
                            echo "ALAUDAALAUDAALAUDAALAUDAALAUDA"
                        }
}

	}
void stepsFunc_qa7() {
		script {
      def ftp_server = "FTPServer"
      def username = "username"
      def password = "password"
      def addresses = "addresses"
      def qa = "qa"
      def ops = "ops"
      def deploy = "deploy"
      def doc = "doc"
      def devops= "devops"
      def ait = "ait"
                              // 定义一个数组，存储一些数字
                    def numbers = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sum = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbers.size(); i++) {
                        if (numbers[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sum += numbers[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sum += numbers[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sum > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersa = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def suma = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersa.size(); i++) {
                        if (numbersa[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            suma += numbersa[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            suma += numbersa[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (suma > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个列表，存储一些字符串
                    def strings = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]

                    // 定义一个变量，用于存储字符串长度之和
                    def lengthSum = 0

                    // 使用 for 循环计算字符串长度之和
                    for (def i = 0; i < strings.size(); i++) {
                        lengthSum += strings[i].length()
                    }

                    // 判断字符串长度之和是否大于 50
                    if (lengthSum > 50) {
                        // 如果大于 50，输出字符串长度之和和字符串个数
                        println "字符串长度之和为 ${lengthSum}，共有 ${strings.size()} 个字符串。"
                    } else {
                        // 如果小于等于 50，输出字符串长度之和和字符串平均长度
                        println "字符串长度之和为 ${lengthSum}，平均长度为 ${lengthSum / strings.size()}。"
                    }

                    // 定义一个变量，用于存储字符串中元音以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：

                    // 定义一个数组，存储一些数字
                    def numbersb = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumb = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersb.size(); i++) {
                        if (numbersb[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumb += numbersb[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumb += numbersb[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumb > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersc = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumc = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersc.size(); i++) {
                        if (numbersc[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumc += numbersc[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumc += numbersc[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumc > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和为了避免重复，这里提供一份不同的 Groovy 示例程序，其中定义了至少 10 个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    def numbersd = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
                    def stringsa = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]
                    def vowels = ['a', 'e', 'i', 'o', 'u']
                    def consonants = ['b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z']
                    def sumd = 0
                    def product = 1
                    def max = 0
                    def min = 0
                    def vowelCount = 0
                    def consonantCount = 0

                    for (def i = 0; i < numbersd.size(); i++) {
                        if (numbersd[i] % 3 == 0) {
                            sumd += numbersd[i]
                        } else if (consonants[i] == "j") {
                            product *= numbersd[i]
                        } else {
                            max = Math.max(max, numbersd[i])
                            min = (i == 0) ? numbersd[i] : Math.min(min, numbersd[i])
                        }
                    }

                    for (def i = 0; i < stringsa.size(); i++) {
                        def currentString = stringsa[i]
                        if (currentString.startsWith('a') || currentString.startsWith('e') || currentString.startsWith('i') || currentString.startsWith('o') || currentString.startsWith('u')) {
                            vowelCount++
                        } else {
                            consonantCount++
                        }
                    }

                    for (int i = 1; i <= 2100; i++) {
                            echo "ALAUDAALAUDAALAUDAALAUDAALAUDA"
                        }
}

	}
void stepsFunc_qa8() {
		script {
      def ftp_server = "FTPServer"
      def username = "username"
      def password = "password"
      def addresses = "addresses"
      def qa = "qa"
      def ops = "ops"
      def deploy = "deploy"
      def doc = "doc"
      def devops= "devops"
      def ait = "ait"
                              // 定义一个数组，存储一些数字
                    def numbers = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sum = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbers.size(); i++) {
                        if (numbers[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sum += numbers[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sum += numbers[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sum > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersa = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def suma = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersa.size(); i++) {
                        if (numbersa[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            suma += numbersa[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            suma += numbersa[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (suma > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个列表，存储一些字符串
                    def strings = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]

                    // 定义一个变量，用于存储字符串长度之和
                    def lengthSum = 0

                    // 使用 for 循环计算字符串长度之和
                    for (def i = 0; i < strings.size(); i++) {
                        lengthSum += strings[i].length()
                    }

                    // 判断字符串长度之和是否大于 50
                    if (lengthSum > 50) {
                        // 如果大于 50，输出字符串长度之和和字符串个数
                        println "字符串长度之和为 ${lengthSum}，共有 ${strings.size()} 个字符串。"
                    } else {
                        // 如果小于等于 50，输出字符串长度之和和字符串平均长度
                        println "字符串长度之和为 ${lengthSum}，平均长度为 ${lengthSum / strings.size()}。"
                    }

                    // 定义一个变量，用于存储字符串中元音以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：

                    // 定义一个数组，存储一些数字
                    def numbersb = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumb = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersb.size(); i++) {
                        if (numbersb[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumb += numbersb[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumb += numbersb[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumb > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersc = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumc = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersc.size(); i++) {
                        if (numbersc[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumc += numbersc[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumc += numbersc[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumc > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和为了避免重复，这里提供一份不同的 Groovy 示例程序，其中定义了至少 10 个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    def numbersd = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
                    def stringsa = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]
                    def vowels = ['a', 'e', 'i', 'o', 'u']
                    def consonants = ['b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z']
                    def sumd = 0
                    def product = 1
                    def max = 0
                    def min = 0
                    def vowelCount = 0
                    def consonantCount = 0

                    for (def i = 0; i < numbersd.size(); i++) {
                        if (numbersd[i] % 3 == 0) {
                            sumd += numbersd[i]
                        } else if (consonants[i] == "j") {
                            product *= numbersd[i]
                        } else {
                            max = Math.max(max, numbersd[i])
                            min = (i == 0) ? numbersd[i] : Math.min(min, numbersd[i])
                        }
                    }

                    for (def i = 0; i < stringsa.size(); i++) {
                        def currentString = stringsa[i]
                        if (currentString.startsWith('a') || currentString.startsWith('e') || currentString.startsWith('i') || currentString.startsWith('o') || currentString.startsWith('u')) {
                            vowelCount++
                        } else {
                            consonantCount++
                        }
                    }

                    for (int i = 1; i <= 2100; i++) {
                            echo "ALAUDAALAUDAALAUDAALAUDAALAUDA"
                        }
}

	}
void stepsFunc_qa9() {
		script {
      def ftp_server = "FTPServer"
      def username = "username"
      def password = "password"
      def addresses = "addresses"
      def qa = "qa"
      def ops = "ops"
      def deploy = "deploy"
      def doc = "doc"
      def devops= "devops"
      def ait = "ait"
                              // 定义一个数组，存储一些数字
                    def numbers = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sum = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbers.size(); i++) {
                        if (numbers[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sum += numbers[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sum += numbers[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sum > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersa = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def suma = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersa.size(); i++) {
                        if (numbersa[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            suma += numbersa[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            suma += numbersa[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (suma > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个列表，存储一些字符串
                    def strings = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]

                    // 定义一个变量，用于存储字符串长度之和
                    def lengthSum = 0

                    // 使用 for 循环计算字符串长度之和
                    for (def i = 0; i < strings.size(); i++) {
                        lengthSum += strings[i].length()
                    }

                    // 判断字符串长度之和是否大于 50
                    if (lengthSum > 50) {
                        // 如果大于 50，输出字符串长度之和和字符串个数
                        println "字符串长度之和为 ${lengthSum}，共有 ${strings.size()} 个字符串。"
                    } else {
                        // 如果小于等于 50，输出字符串长度之和和字符串平均长度
                        println "字符串长度之和为 ${lengthSum}，平均长度为 ${lengthSum / strings.size()}。"
                    }

                    // 定义一个变量，用于存储字符串中元音以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：

                    // 定义一个数组，存储一些数字
                    def numbersb = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumb = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersb.size(); i++) {
                        if (numbersb[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumb += numbersb[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumb += numbersb[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumb > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersc = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumc = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersc.size(); i++) {
                        if (numbersc[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumc += numbersc[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumc += numbersc[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumc > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和为了避免重复，这里提供一份不同的 Groovy 示例程序，其中定义了至少 10 个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    def numbersd = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
                    def stringsa = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]
                    def vowels = ['a', 'e', 'i', 'o', 'u']
                    def consonants = ['b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z']
                    def sumd = 0
                    def product = 1
                    def max = 0
                    def min = 0
                    def vowelCount = 0
                    def consonantCount = 0

                    for (def i = 0; i < numbersd.size(); i++) {
                        if (numbersd[i] % 3 == 0) {
                            sumd += numbersd[i]
                        } else if (consonants[i] == "j") {
                            product *= numbersd[i]
                        } else {
                            max = Math.max(max, numbersd[i])
                            min = (i == 0) ? numbersd[i] : Math.min(min, numbersd[i])
                        }
                    }

                    for (def i = 0; i < stringsa.size(); i++) {
                        def currentString = stringsa[i]
                        if (currentString.startsWith('a') || currentString.startsWith('e') || currentString.startsWith('i') || currentString.startsWith('o') || currentString.startsWith('u')) {
                            vowelCount++
                        } else {
                            consonantCount++
                        }
                    }

                    for (int i = 1; i <= 2100; i++) {
                            echo "ALAUDAALAUDAALAUDAALAUDAALAUDA"
                        }
}

	}
void stepsFunc_qa10() {
		script {
      def ftp_server = "FTPServer"
      def username = "username"
      def password = "password"
      def addresses = "addresses"
      def qa = "qa"
      def ops = "ops"
      def deploy = "deploy"
      def doc = "doc"
      def devops= "devops"
      def ait = "ait"
                              // 定义一个数组，存储一些数字
                    def numbers = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sum = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbers.size(); i++) {
                        if (numbers[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sum += numbers[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sum += numbers[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sum > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersa = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def suma = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersa.size(); i++) {
                        if (numbersa[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            suma += numbersa[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            suma += numbersa[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (suma > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个列表，存储一些字符串
                    def strings = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]

                    // 定义一个变量，用于存储字符串长度之和
                    def lengthSum = 0

                    // 使用 for 循环计算字符串长度之和
                    for (def i = 0; i < strings.size(); i++) {
                        lengthSum += strings[i].length()
                    }

                    // 判断字符串长度之和是否大于 50
                    if (lengthSum > 50) {
                        // 如果大于 50，输出字符串长度之和和字符串个数
                        println "字符串长度之和为 ${lengthSum}，共有 ${strings.size()} 个字符串。"
                    } else {
                        // 如果小于等于 50，输出字符串长度之和和字符串平均长度
                        println "字符串长度之和为 ${lengthSum}，平均长度为 ${lengthSum / strings.size()}。"
                    }

                    // 定义一个变量，用于存储字符串中元音以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：

                    // 定义一个数组，存储一些数字
                    def numbersb = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumb = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersb.size(); i++) {
                        if (numbersb[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumb += numbersb[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumb += numbersb[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumb > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersc = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumc = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersc.size(); i++) {
                        if (numbersc[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumc += numbersc[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumc += numbersc[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumc > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和为了避免重复，这里提供一份不同的 Groovy 示例程序，其中定义了至少 10 个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    def numbersd = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
                    def stringsa = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]
                    def vowels = ['a', 'e', 'i', 'o', 'u']
                    def consonants = ['b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z']
                    def sumd = 0
                    def product = 1
                    def max = 0
                    def min = 0
                    def vowelCount = 0
                    def consonantCount = 0

                    for (def i = 0; i < numbersd.size(); i++) {
                        if (numbersd[i] % 3 == 0) {
                            sumd += numbersd[i]
                        } else if (consonants[i] == "j") {
                            product *= numbersd[i]
                        } else {
                            max = Math.max(max, numbersd[i])
                            min = (i == 0) ? numbersd[i] : Math.min(min, numbersd[i])
                        }
                    }

                    for (def i = 0; i < stringsa.size(); i++) {
                        def currentString = stringsa[i]
                        if (currentString.startsWith('a') || currentString.startsWith('e') || currentString.startsWith('i') || currentString.startsWith('o') || currentString.startsWith('u')) {
                            vowelCount++
                        } else {
                            consonantCount++
                        }
                    }

                    for (int i = 1; i <= 2100; i++) {
                            echo "ALAUDAALAUDAALAUDAALAUDAALAUDA"
                        }
}

	}
void stepsFunc_qa11() {
		script {
      def ftp_server = "FTPServer"
      def username = "username"
      def password = "password"
      def addresses = "addresses"
      def qa = "qa"
      def ops = "ops"
      def deploy = "deploy"
      def doc = "doc"
      def devops= "devops"
      def ait = "ait"
                              // 定义一个数组，存储一些数字
                    def numbers = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sum = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbers.size(); i++) {
                        if (numbers[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sum += numbers[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sum += numbers[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sum > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersa = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def suma = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersa.size(); i++) {
                        if (numbersa[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            suma += numbersa[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            suma += numbersa[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (suma > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个列表，存储一些字符串
                    def strings = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]

                    // 定义一个变量，用于存储字符串长度之和
                    def lengthSum = 0

                    // 使用 for 循环计算字符串长度之和
                    for (def i = 0; i < strings.size(); i++) {
                        lengthSum += strings[i].length()
                    }

                    // 判断字符串长度之和是否大于 50
                    if (lengthSum > 50) {
                        // 如果大于 50，输出字符串长度之和和字符串个数
                        println "字符串长度之和为 ${lengthSum}，共有 ${strings.size()} 个字符串。"
                    } else {
                        // 如果小于等于 50，输出字符串长度之和和字符串平均长度
                        println "字符串长度之和为 ${lengthSum}，平均长度为 ${lengthSum / strings.size()}。"
                    }

                    // 定义一个变量，用于存储字符串中元音以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：

                    // 定义一个数组，存储一些数字
                    def numbersb = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumb = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersb.size(); i++) {
                        if (numbersb[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumb += numbersb[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumb += numbersb[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumb > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersc = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumc = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersc.size(); i++) {
                        if (numbersc[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumc += numbersc[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumc += numbersc[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumc > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和为了避免重复，这里提供一份不同的 Groovy 示例程序，其中定义了至少 10 个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    def numbersd = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
                    def stringsa = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]
                    def vowels = ['a', 'e', 'i', 'o', 'u']
                    def consonants = ['b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z']
                    def sumd = 0
                    def product = 1
                    def max = 0
                    def min = 0
                    def vowelCount = 0
                    def consonantCount = 0

                    for (def i = 0; i < numbersd.size(); i++) {
                        if (numbersd[i] % 3 == 0) {
                            sumd += numbersd[i]
                        } else if (consonants[i] == "j") {
                            product *= numbersd[i]
                        } else {
                            max = Math.max(max, numbersd[i])
                            min = (i == 0) ? numbersd[i] : Math.min(min, numbersd[i])
                        }
                    }

                    for (def i = 0; i < stringsa.size(); i++) {
                        def currentString = stringsa[i]
                        if (currentString.startsWith('a') || currentString.startsWith('e') || currentString.startsWith('i') || currentString.startsWith('o') || currentString.startsWith('u')) {
                            vowelCount++
                        } else {
                            consonantCount++
                        }
                    }

                    for (int i = 1; i <= 2100; i++) {
                            echo "ALAUDAALAUDAALAUDAALAUDAALAUDA"
                        }
}

	}
void stepsFunc_qa12() {
		script {
      def ftp_server = "FTPServer"
      def username = "username"
      def password = "password"
      def addresses = "addresses"
      def qa = "qa"
      def ops = "ops"
      def deploy = "deploy"
      def doc = "doc"
      def devops= "devops"
      def ait = "ait"
                              // 定义一个数组，存储一些数字
                    def numbers = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sum = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbers.size(); i++) {
                        if (numbers[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sum += numbers[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sum += numbers[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sum > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersa = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def suma = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersa.size(); i++) {
                        if (numbersa[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            suma += numbersa[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            suma += numbersa[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (suma > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个列表，存储一些字符串
                    def strings = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]

                    // 定义一个变量，用于存储字符串长度之和
                    def lengthSum = 0

                    // 使用 for 循环计算字符串长度之和
                    for (def i = 0; i < strings.size(); i++) {
                        lengthSum += strings[i].length()
                    }

                    // 判断字符串长度之和是否大于 50
                    if (lengthSum > 50) {
                        // 如果大于 50，输出字符串长度之和和字符串个数
                        println "字符串长度之和为 ${lengthSum}，共有 ${strings.size()} 个字符串。"
                    } else {
                        // 如果小于等于 50，输出字符串长度之和和字符串平均长度
                        println "字符串长度之和为 ${lengthSum}，平均长度为 ${lengthSum / strings.size()}。"
                    }

                    // 定义一个变量，用于存储字符串中元音以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：

                    // 定义一个数组，存储一些数字
                    def numbersb = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumb = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersb.size(); i++) {
                        if (numbersb[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumb += numbersb[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumb += numbersb[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumb > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersc = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumc = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersc.size(); i++) {
                        if (numbersc[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumc += numbersc[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumc += numbersc[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumc > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和为了避免重复，这里提供一份不同的 Groovy 示例程序，其中定义了至少 10 个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    def numbersd = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
                    def stringsa = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]
                    def vowels = ['a', 'e', 'i', 'o', 'u']
                    def consonants = ['b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z']
                    def sumd = 0
                    def product = 1
                    def max = 0
                    def min = 0
                    def vowelCount = 0
                    def consonantCount = 0

                    for (def i = 0; i < numbersd.size(); i++) {
                        if (numbersd[i] % 3 == 0) {
                            sumd += numbersd[i]
                        } else if (consonants[i] == "j") {
                            product *= numbersd[i]
                        } else {
                            max = Math.max(max, numbersd[i])
                            min = (i == 0) ? numbersd[i] : Math.min(min, numbersd[i])
                        }
                    }

                    for (def i = 0; i < stringsa.size(); i++) {
                        def currentString = stringsa[i]
                        if (currentString.startsWith('a') || currentString.startsWith('e') || currentString.startsWith('i') || currentString.startsWith('o') || currentString.startsWith('u')) {
                            vowelCount++
                        } else {
                            consonantCount++
                        }
                    }

                    for (int i = 1; i <= 2100; i++) {
                            echo "ALAUDAALAUDAALAUDAALAUDAALAUDA"
                        }
}

	}
void stepsFunc_qa13() {
		script {
      def ftp_server = "FTPServer"
      def username = "username"
      def password = "password"
      def addresses = "addresses"
      def qa = "qa"
      def ops = "ops"
      def deploy = "deploy"
      def doc = "doc"
      def devops= "devops"
      def ait = "ait"
                              // 定义一个数组，存储一些数字
                    def numbers = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sum = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbers.size(); i++) {
                        if (numbers[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sum += numbers[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sum += numbers[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sum > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersa = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def suma = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersa.size(); i++) {
                        if (numbersa[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            suma += numbersa[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            suma += numbersa[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (suma > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个列表，存储一些字符串
                    def strings = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]

                    // 定义一个变量，用于存储字符串长度之和
                    def lengthSum = 0

                    // 使用 for 循环计算字符串长度之和
                    for (def i = 0; i < strings.size(); i++) {
                        lengthSum += strings[i].length()
                    }

                    // 判断字符串长度之和是否大于 50
                    if (lengthSum > 50) {
                        // 如果大于 50，输出字符串长度之和和字符串个数
                        println "字符串长度之和为 ${lengthSum}，共有 ${strings.size()} 个字符串。"
                    } else {
                        // 如果小于等于 50，输出字符串长度之和和字符串平均长度
                        println "字符串长度之和为 ${lengthSum}，平均长度为 ${lengthSum / strings.size()}。"
                    }

                    // 定义一个变量，用于存储字符串中元音以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：

                    // 定义一个数组，存储一些数字
                    def numbersb = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumb = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersb.size(); i++) {
                        if (numbersb[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumb += numbersb[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumb += numbersb[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumb > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersc = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumc = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersc.size(); i++) {
                        if (numbersc[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumc += numbersc[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumc += numbersc[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumc > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和为了避免重复，这里提供一份不同的 Groovy 示例程序，其中定义了至少 10 个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    def numbersd = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
                    def stringsa = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]
                    def vowels = ['a', 'e', 'i', 'o', 'u']
                    def consonants = ['b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z']
                    def sumd = 0
                    def product = 1
                    def max = 0
                    def min = 0
                    def vowelCount = 0
                    def consonantCount = 0

                    for (def i = 0; i < numbersd.size(); i++) {
                        if (numbersd[i] % 3 == 0) {
                            sumd += numbersd[i]
                        } else if (consonants[i] == "j") {
                            product *= numbersd[i]
                        } else {
                            max = Math.max(max, numbersd[i])
                            min = (i == 0) ? numbersd[i] : Math.min(min, numbersd[i])
                        }
                    }

                    for (def i = 0; i < stringsa.size(); i++) {
                        def currentString = stringsa[i]
                        if (currentString.startsWith('a') || currentString.startsWith('e') || currentString.startsWith('i') || currentString.startsWith('o') || currentString.startsWith('u')) {
                            vowelCount++
                        } else {
                            consonantCount++
                        }
                    }

                    for (int i = 1; i <= 2100; i++) {
                            echo "ALAUDAALAUDAALAUDAALAUDAALAUDA"
                        }
}

	}
void stepsFunc_qa14() {
		script {
      def ftp_server = "FTPServer"
      def username = "username"
      def password = "password"
      def addresses = "addresses"
      def qa = "qa"
      def ops = "ops"
      def deploy = "deploy"
      def doc = "doc"
      def devops= "devops"
      def ait = "ait"
                              // 定义一个数组，存储一些数字
                    def numbers = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sum = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbers.size(); i++) {
                        if (numbers[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sum += numbers[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sum += numbers[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sum > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersa = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def suma = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersa.size(); i++) {
                        if (numbersa[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            suma += numbersa[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            suma += numbersa[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (suma > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个列表，存储一些字符串
                    def strings = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]

                    // 定义一个变量，用于存储字符串长度之和
                    def lengthSum = 0

                    // 使用 for 循环计算字符串长度之和
                    for (def i = 0; i < strings.size(); i++) {
                        lengthSum += strings[i].length()
                    }

                    // 判断字符串长度之和是否大于 50
                    if (lengthSum > 50) {
                        // 如果大于 50，输出字符串长度之和和字符串个数
                        println "字符串长度之和为 ${lengthSum}，共有 ${strings.size()} 个字符串。"
                    } else {
                        // 如果小于等于 50，输出字符串长度之和和字符串平均长度
                        println "字符串长度之和为 ${lengthSum}，平均长度为 ${lengthSum / strings.size()}。"
                    }

                    // 定义一个变量，用于存储字符串中元音以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：

                    // 定义一个数组，存储一些数字
                    def numbersb = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumb = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersb.size(); i++) {
                        if (numbersb[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumb += numbersb[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumb += numbersb[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumb > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersc = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumc = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersc.size(); i++) {
                        if (numbersc[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumc += numbersc[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumc += numbersc[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumc > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和为了避免重复，这里提供一份不同的 Groovy 示例程序，其中定义了至少 10 个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    def numbersd = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
                    def stringsa = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]
                    def vowels = ['a', 'e', 'i', 'o', 'u']
                    def consonants = ['b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z']
                    def sumd = 0
                    def product = 1
                    def max = 0
                    def min = 0
                    def vowelCount = 0
                    def consonantCount = 0

                    for (def i = 0; i < numbersd.size(); i++) {
                        if (numbersd[i] % 3 == 0) {
                            sumd += numbersd[i]
                        } else if (consonants[i] == "j") {
                            product *= numbersd[i]
                        } else {
                            max = Math.max(max, numbersd[i])
                            min = (i == 0) ? numbersd[i] : Math.min(min, numbersd[i])
                        }
                    }

                    for (def i = 0; i < stringsa.size(); i++) {
                        def currentString = stringsa[i]
                        if (currentString.startsWith('a') || currentString.startsWith('e') || currentString.startsWith('i') || currentString.startsWith('o') || currentString.startsWith('u')) {
                            vowelCount++
                        } else {
                            consonantCount++
                        }
                    }

                    for (int i = 1; i <= 2100; i++) {
                            echo "ALAUDAALAUDAALAUDAALAUDAALAUDA"
                        }
}

	}
void stepsFunc_qa15() {
		script {
      def ftp_server = "FTPServer"
      def username = "username"
      def password = "password"
      def addresses = "addresses"
      def qa = "qa"
      def ops = "ops"
      def deploy = "deploy"
      def doc = "doc"
      def devops= "devops"
      def ait = "ait"
                              // 定义一个数组，存储一些数字
                    def numbers = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sum = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbers.size(); i++) {
                        if (numbers[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sum += numbers[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sum += numbers[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sum > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersa = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def suma = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersa.size(); i++) {
                        if (numbersa[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            suma += numbersa[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            suma += numbersa[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (suma > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个列表，存储一些字符串
                    def strings = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]

                    // 定义一个变量，用于存储字符串长度之和
                    def lengthSum = 0

                    // 使用 for 循环计算字符串长度之和
                    for (def i = 0; i < strings.size(); i++) {
                        lengthSum += strings[i].length()
                    }

                    // 判断字符串长度之和是否大于 50
                    if (lengthSum > 50) {
                        // 如果大于 50，输出字符串长度之和和字符串个数
                        println "字符串长度之和为 ${lengthSum}，共有 ${strings.size()} 个字符串。"
                    } else {
                        // 如果小于等于 50，输出字符串长度之和和字符串平均长度
                        println "字符串长度之和为 ${lengthSum}，平均长度为 ${lengthSum / strings.size()}。"
                    }

                    // 定义一个变量，用于存储字符串中元音以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：

                    // 定义一个数组，存储一些数字
                    def numbersb = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumb = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersb.size(); i++) {
                        if (numbersb[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumb += numbersb[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumb += numbersb[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumb > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和以下是一个 Groovy 程序示例，其中定义了至少10个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                    println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    // 定义一个数组，存储一些数字
                    def numbersc = [3, 5, 8, 10, 15, 23, 28, 31, 38, 40]

                    // 定义一个变量，用于存储数字之和
                    def sumc = 0

                    // 使用 for 循环计算数字之和
                    for (def i = 0; i < numbersc.size(); i++) {
                        if (numbersc[i] % 2 == 0) {
                            // 如果数字是偶数，将其加到 sum 中
                            sumc += numbersc[i]
                        } else {
                            // 如果数字是奇数，将其乘以 2 后再加到 sum 中
                            sumc += numbersc[i] * 2
                        }
                    }

                    // 判断数字之和是否大于 50
                    if (sumc > 50) {
                        // 如果大于 50，输出数字之和和数字个数
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    } else {
                        // 如果小于等于 50，输出数字之和为了避免重复，这里提供一份不同的 Groovy 示例程序，其中定义了至少 10 个变量，包含多个逻辑判断和循环，共计约 140 行代码：
                        println "数字之和为 ${sum}，共有 ${numbers.size()} 个数字。"
                    }

                    def numbersd = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
                    def stringsa = ["apple", "banana", "cherry", "orange", "pear", "grape", "kiwi", "mango", "pineapple", "watermelon"]
                    def vowels = ['a', 'e', 'i', 'o', 'u']
                    def consonants = ['b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z']
                    def sumd = 0
                    def product = 1
                    def max = 0
                    def min = 0
                    def vowelCount = 0
                    def consonantCount = 0

                    for (def i = 0; i < numbersd.size(); i++) {
                        if (numbersd[i] % 3 == 0) {
                            sumd += numbersd[i]
                        } else if (consonants[i] == "j") {
                            product *= numbersd[i]
                        } else {
                            max = Math.max(max, numbersd[i])
                            min = (i == 0) ? numbersd[i] : Math.min(min, numbersd[i])
                        }
                    }

                    for (def i = 0; i < stringsa.size(); i++) {
                        def currentString = stringsa[i]
                        if (currentString.startsWith('a') || currentString.startsWith('e') || currentString.startsWith('i') || currentString.startsWith('o') || currentString.startsWith('u')) {
                            vowelCount++
                        } else {
                            consonantCount++
                        }
                    }

                    for (int i = 1; i <= 2100; i++) {
                            echo "ALAUDAALAUDAALAUDAALAUDAALAUDA"
                        }
}

	}
pipeline{

	

	agent {label "base"}
	environment{
			ALAUDA_PROJECT = "stwu"
	}
    options{
        buildDiscarder(logRotator(numToKeepStr: '200'))
	}

	stages{
		stage("FTPTest"){

	
	steps{
		stepsFunc_FTPTest()
	}
}
stage("qa2"){

	
	steps{
		stepsFunc_qa2()
	}
}
stage("qa3"){

	
	steps{
		stepsFunc_qa3()
	}
}
stage("qa4"){

	
	steps{
		stepsFunc_qa4()
	}
}
stage("qa5"){

	
	steps{
		stepsFunc_qa5()
	}
}
stage("qa6"){

	
	steps{
		stepsFunc_qa6()
	}
}
stage("qa7"){

	
	steps{
		stepsFunc_qa7()
	}
}
stage("qa8"){

	
	steps{
		stepsFunc_qa8()
	}
}
stage("qa9"){

	
	steps{
		stepsFunc_qa9()
	}
}
stage("qa10"){

	
	steps{
		stepsFunc_qa10()
	}
}
stage("qa11"){

	
	steps{
		stepsFunc_qa11()
	}
}
stage("qa12"){

	
	steps{
		stepsFunc_qa12()
	}
}
stage("qa13"){

	
	steps{
		stepsFunc_qa13()
	}
}
stage("qa14"){

	
	steps{
		stepsFunc_qa14()
	}
}
stage("qa15"){

	
	steps{
		stepsFunc_qa15()
	}
}

	}
	post{
		always{
	
			script{
				echo "clean up workspace"
				try {
				   deleteDir()
				}
				catch (err) {
                   echo err.getMessage()
				}
			}

}

	}
}
