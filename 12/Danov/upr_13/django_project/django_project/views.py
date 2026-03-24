from django.http import HttpResponse

def helloworld(request):
    return HttpResponse("<h2>Hello World</h2>")
