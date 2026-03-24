from django.test import TestCase
from django.urls import reverse
from django.contrib.auth.models import User
from .models import Post

# Create your tests here.

class PostModelTest(TestCase):
    def setUp(self):
        self.user = User.objects.create_user(username='testuser', password='12345')
        self.post = Post.objects.create(
            title='Test Post',
            author=self.user,
            body='This is a test post body.'
        )

    def test_post_creation(self):
        self.assertEqual(self.post.title, 'Test Post')
        self.assertEqual(self.post.author, self.user)
        self.assertEqual(self.post.body, 'This is a test post body.')

    def test_post_str(self):
        self.assertEqual(str(self.post), 'Test Post')  # Assuming __str__ returns title

    def test_get_absolute_url(self):
        expected_url = reverse('post_detail', kwargs={'pk': self.post.pk})
        self.assertEqual(self.post.get_absolute_url(), expected_url)

class PostViewTest(TestCase):
    def setUp(self):
        self.user = User.objects.create_user(username='testuser', password='12345')
        self.post = Post.objects.create(
            title='Test Post',
            author=self.user,
            body='This is a test post body.'
        )

    def test_post_list_view(self):
        response = self.client.get(reverse('post_list'))
        self.assertEqual(response.status_code, 200)
        self.assertTemplateUsed(response, 'blog/home.html')
        self.assertContains(response, 'Test Post')
        self.assertIn('posts', response.context)
        self.assertEqual(len(response.context['posts']), 1)

    def test_post_detail_view(self):
        response = self.client.get(reverse('post_detail', kwargs={'pk': self.post.pk}))
        self.assertEqual(response.status_code, 200)
        self.assertTemplateUsed(response, 'blog/post_detail.html')
        self.assertContains(response, 'Test Post')
        self.assertContains(response, 'This is a test post body.')
        self.assertIn('post', response.context)
        self.assertEqual(response.context['post'], self.post)
