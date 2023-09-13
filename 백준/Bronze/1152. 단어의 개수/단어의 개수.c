#include <stdio.h>
#include<string.h>

int main(void) {

    int count = 1, i;
    char a[1000000];
    gets(a);

    for (i = 1; a[i] != NULL; i++) {
        if (a[i] == ' ')
            count++;
    }
    if (a[strlen(a)-1] == ' ')
        count--;
    printf("%d", count);
    return 0;

}