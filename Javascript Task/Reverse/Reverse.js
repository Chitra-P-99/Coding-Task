document.addEventListener('DOMContentLoaded', function () {
    const inputForm = document.getElementById('inputForm');
    const output = document.getElementById('output');

    inputForm.addEventListener('submit', function (e) {
        e.preventDefault(); // Prevent the form from submitting

        const sentence = document.getElementById('sentence').value;
        const reversed = reverseWords(sentence);
        output.textContent = "Reversed sentence: " + reversed;
    });


function reverseWords(sentence) {
    let reversedSentence = '';
    let wordStart = 0;
    let inWord = false;

    for (let i = 0; i < sentence.length; i++) {
        if (sentence[i] === ' ') {
            if (inWord) {
                reversedSentence = reverseWord(sentence, wordStart, i - 1) + ' ';
                inWord = false;
            } else {
                reversedSentence += ' ';
            }
        } else {
            if (!inWord) {
                wordStart = i;
                inWord = true;
            }
        }
    }

    if (inWord) {
        reversedSentence += reverseWord(sentence, wordStart, sentence.length - 1);
    }

    return reversedSentence;
}

function reverseWord(sentence, start, end) {
    let reversed = '';
    for (let i = end; i >= start; i--) {
        reversed += sentence[i];
    }
    return reversed;
}

})
