#include <stdio.h>
#include <string.h>

#define NUMBER_OF_STRING 4
#define MAX_STRING_SIZE 40
#define DEST_SIZE 100

int main()
{
	char arr[NUMBER_OF_STRING][MAX_STRING_SIZE] =
	{ "Indomie Goreng",
	  "Indomie Rebus",
	  "Kentang Goreng",
	  "Pop Mie"
	};

	char dest[DEST_SIZE] = "";

	for (int i = 0; i < NUMBER_OF_STRING; i++)
	{
		printf("%i. ",i);
		strcat(dest, arr[i]);
		if (i < NUMBER_OF_STRING - 1)
		{
		    strcat(dest, "\n");
		}
	}

	printf(dest);

	return 0;
}