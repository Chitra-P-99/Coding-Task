document.addEventListener('DOMContentLoaded', function () {
    const inputForm = document.getElementById('inputForm');
    const output = document.getElementById('output');

    inputForm.addEventListener('submit', function (e) {
        e.preventDefault(); // Prevent the form from submitting

        const numbersInput = document.getElementById('numbers').value;
        const numbersArray = numbersInput.split(',').map(Number);
        const sortedArray = customSortDescending(numbersArray);
        output.textContent = "Sorted array (descending order): " + sortedArray.join(', ');
    });

    function customSortDescending(arr) {
        for (let i = 0; i < arr.length; i++) {
            for (let j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    const temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
});
