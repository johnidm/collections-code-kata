# -*- coding: utf-8 -*-
from __future__ import unicode_literals

from django.db import models, migrations
from django.conf import settings


class Migration(migrations.Migration):

    dependencies = [
        migrations.swappable_dependency(settings.AUTH_USER_MODEL),
    ]

    operations = [
        migrations.CreateModel(
            name='Sprint',
            fields=[
                ('id', models.AutoField(primary_key=True, auto_created=True, serialize=False, verbose_name='ID')),
                ('name', models.CharField(max_length=100, default='', blank=True)),
                ('description', models.TextField(default='', blank=True)),
                ('end', models.DateField(unique=True)),
            ],
        ),
        migrations.CreateModel(
            name='Task',
            fields=[
                ('id', models.AutoField(primary_key=True, auto_created=True, serialize=False, verbose_name='ID')),
                ('name', models.CharField(max_length=100)),
                ('description', models.TextField(default='', blank=True)),
                ('status', models.SmallIntegerField(choices=[(1, 'Not Started'), (2, 'In Progress'), (3, 'Testing'), (4, 'Done')], default=1)),
                ('order', models.SmallIntegerField(default=0)),
                ('due', models.DateField(blank=True, null=True)),
                ('completed', models.DateField(blank=True, null=True)),
                ('assigned', models.ForeignKey(to=settings.AUTH_USER_MODEL, blank=True, null=True)),
                ('sprint', models.ForeignKey(to='board.Sprint', blank=True, null=True)),
            ],
        ),
    ]
