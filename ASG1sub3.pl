#! /usr/bin/perl

use strict;
use warnings;
use Encode;

my $outfile = "last-perl.txt";
my $binfile = "NazrulYusni-perl.bin";
my $line;

open(FHbin, '<:raw:utf8', $binfile) or die "Unable to open: $!";
open(my $FHtxt, '>', $outfile) or die "Unable to open: $!";
foreach $line (<FHbin>) {
	print $FHtxt $line;
}
close(FHbin);
close($FHtxt);
